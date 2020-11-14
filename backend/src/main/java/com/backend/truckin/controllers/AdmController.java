package com.backend.truckin.controllers;

import com.backend.truckin.models.Adm;
import com.backend.truckin.repositories.AdmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AdmController{

    @Autowired
    private AdmRepository admRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("adms")
    public String adms(Model model) {
        System.out.println("entrou nesse método adms");
        Iterable<Adm> adms = admRepository.findAll();
        model.addAttribute("adms", adms);

        return "adms";
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String salvar(@Valid Adm adm, Model model) {

        System.out.println(adm);
        admRepository.save(adm);

        Iterable<Adm> adms = admRepository.findAll();
        model.addAttribute("adms", adms);

        return "adms";
    }


}