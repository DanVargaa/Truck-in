package com.backend.truckin.controllers;

import com.backend.truckin.models.HistoricoSessao;
import com.backend.truckin.repositories.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class SessaoTrabalhoController {
    @Autowired
    private SessaoRepository sessaoRepository;

    @RequestMapping("sessaoTrabalho")
    public String sessaoTrabalho(Model model) {
        System.out.println("entrou nesse método sesao de trabalho");
        Iterable<HistoricoSessao> sessaoTrabalho = sessaoRepository.findAll();
        model.addAttribute("sessaoTrabalho", sessaoTrabalho);

        return "sessaoTrabalho";
    }

    @RequestMapping(value = "salvarSessao", method = RequestMethod.POST)
    public String salvar(@Valid HistoricoSessao sessao, Model model) {

        System.out.println(sessao);
        sessaoRepository.save(sessao);

        Iterable<HistoricoSessao> sessaoTrabalho = sessaoRepository.findAll();
        model.addAttribute("sessaoTrabalho", sessaoTrabalho);

        return "adms";
    }

}
