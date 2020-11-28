package com.backend.truckin.controllers;

import com.backend.truckin.models.SessaoTrabalho;
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

    @RequestMapping("sessoes")
    public String sessoes(Model model) {
        System.out.println("entrou nesse método sessão de trabalho");
        Iterable<SessaoTrabalho> sessoes = sessaoRepository.findAll();
        model.addAttribute("sessoes", sessoes);

        return "sessoes";
    }

    @RequestMapping(value = "salvarSessao", method = RequestMethod.POST)
    public String salvar(@Valid SessaoTrabalho sessao, Model model) {

        System.out.println(sessao);
        sessaoRepository.save(sessao);

        Iterable<SessaoTrabalho> sessoes = sessaoRepository.findAll();
        model.addAttribute("sessoes", sessoes);

        return "adms";
    }

}
