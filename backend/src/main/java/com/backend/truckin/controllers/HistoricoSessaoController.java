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
public class HistoricoSessaoController {
    @Autowired
    private SessaoRepository sessaoRepository;

    @RequestMapping("historicoSessao")
    public String historicoSessao(Model model) {
        System.out.println("entrou nesse método historico de sessao");
        Iterable<HistoricoSessao> historicoSessao = sessaoRepository.findAll();
        model.addAttribute("historicoSessao", historicoSessao);

        return "historicoSessao";
    }
    @RequestMapping(value = "salvarSessao", method = RequestMethod.POST)
    public String salvar(@Valid HistoricoSessao sessao, Model model) {

        System.out.println(sessao);
        sessaoRepository.save(sessao);

        Iterable<HistoricoSessao> historicoSessao = sessaoRepository.findAll();
        model.addAttribute("historicoSessao", historicoSessao);

        return "adms";
    }


}
