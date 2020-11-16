package com.backend.truckin.controllers;

import com.backend.truckin.models.Pacote;
import com.backend.truckin.repositories.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class PacoteController {
    @Autowired
    private PacoteRepository pacoteRepository;
    @RequestMapping("pacotes")
    public String pacotes(Model model) {
        System.out.println("entrou nesse método adms");
        Iterable<Pacote> pacotes = pacoteRepository.findAll();
        model.addAttribute("pacotes", pacotes);

        return "pacotes";
    }

    @RequestMapping(value = "salvarPacote", method = RequestMethod.POST)
    public String salvar(@Valid Pacote pacote, Model model) {

        System.out.println(pacote);
        pacoteRepository.save(pacote);

        Iterable<Pacote> pacotes = pacoteRepository.findAll();
        model.addAttribute("pacotes", pacotes);

        return "adms";
    }
}
