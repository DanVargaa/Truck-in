package com.backend.truckin.controllers;

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
public class PacoteController {
    @Autowired
    PacoteRepository pacoteRepository;
    Pacote pac = new Pacote();
    private IdManager classe = new IdManager();

    @RequestMapping("listaPacote")
    public String listaPacote(Model model)
    {
        System.out.println("entrou nesse método pacote");
        Iterable<Pacote> listaPacote = pacoteRepository.findAll();
      model.addAttribute("listaPacote", listaPacote);
        return "listaPacote";
    }

}
