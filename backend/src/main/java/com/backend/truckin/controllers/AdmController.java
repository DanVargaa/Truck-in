package com.backend.truckin.controllers;

import com.backend.truckin.models.Adm;
import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.LOG;
import com.backend.truckin.repositories.AdmRepository;
import com.backend.truckin.repositories.LOGRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AdmController{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    IdManager classe = new IdManager();
    @Autowired
    private LOGRepository logRepository;


    @Autowired
    private AdmRepository admRepository;

    @RequestMapping("admCad")
    public String adms(Model model) {
        return "admCad";
    }

    @RequestMapping(value = "salvarAdm", method = RequestMethod.POST)
    public String salvar(@Valid Adm adm, Model model) {
        LOG logSessaoDeTrabalho = new LOG();
        logSessaoDeTrabalho.setAcaoEfetuada("Cadastrou um Administrador");
        logSessaoDeTrabalho.setIdAdm(classe.Id_Adm);
        logSessaoDeTrabalho.setIdUser(adm.getId());
        logRepository.save(logSessaoDeTrabalho);
        System.out.println(adm);
        admRepository.save(adm);

        Iterable<Adm> adms = admRepository.findAll();
        model.addAttribute("adms", adms);

        return "admCad";
    }


}