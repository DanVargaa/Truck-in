package com.backend.truckin.controllers;

import com.backend.truckin.models.Adm;
import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.Pacote;
import com.backend.truckin.repositories.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class pacoteCadController {
    @Autowired
    PacoteRepository pacoteRepository;
    Pacote pac = new Pacote();
    @RequestMapping("pacoteCad")
    public String sessaoPacote(Model model)
    {
        System.out.println("entrou nesse método pacote");
        Iterable<Pacote> sessaoPacote = pacoteRepository.findAll();
        model.addAttribute("sessaoPacote", sessaoPacote);

        return "pacoteCad";
    }

    @RequestMapping(value = "salvarPacote", method = RequestMethod.POST)
    public String salvar(@Valid Pacote pacote, Model model) {

        System.out.println(pacote);
        pacoteRepository.save(pacote);

        Iterable<Pacote> sessaoPacote = pacoteRepository.findAll();
        model.addAttribute("sessaoPacote", sessaoPacote);

        return "pacoteCad";
    }
}