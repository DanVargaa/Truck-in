package com.backend.truckin.controllers;

import com.backend.truckin.models.Adm;
import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.LOG;
import com.backend.truckin.models.Pacote;
import com.backend.truckin.repositories.LOGRepository;
import com.backend.truckin.repositories.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class pacoteCadController {
    private IdManager classe = new IdManager();
    @Autowired
    PacoteRepository pacoteRepository;

    @Autowired
    LOGRepository logRepository;
    Pacote pac = new Pacote();
    @RequestMapping("pacoteCad")
    public String sessaoPacote(Model model)
    {
        System.out.println("entrou nesse método pacote");
        Iterable<Pacote> pacotes = pacoteRepository.findAll();
        model.addAttribute("pacotes", pacotes);

        return "pacoteCad";
    }

    @RequestMapping(value = "salvarPacote", method = RequestMethod.POST)
    public String salvar(@Valid Pacote pacote, Model model) {
        LOG logSessaoDeTrabalho = new LOG();
        logSessaoDeTrabalho.setAcaoEfetuada("Salvou um pacote de trabalho");
        logSessaoDeTrabalho.setIdAdm(classe.Id_Adm);
        logSessaoDeTrabalho.setIdUser(pacote.getId());
        logRepository.save(logSessaoDeTrabalho);

        System.out.println(pacote);
        pacoteRepository.save(pacote);

        Iterable<Pacote> pacotes = pacoteRepository.findAll();
        model.addAttribute("pacotes", pacotes);

        return "return:/admActions";
    }
}