package com.backend.truckin.controllers;

import com.backend.truckin.models.SessaoTrabalho;
import com.backend.truckin.models.IdManager;
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
    SessaoRepository sessaoRepository;

    private IdManager classe = new IdManager();

    @RequestMapping("historicoSessao")
    public String historicoSessao(Model model) {
  /*      long PerfilId = classe.Id_PerfilUsu;
        System.out.println("entrou nesse método historico de sessao");
        SessaoTrabalho historicoSessao = sessaoRepository.findById(PerfilId);
        model.addAttribute("historicoSessao", historicoSessao);*/

        return "historicoSessao";
    }
    @RequestMapping(value = "salvarSessao", method = RequestMethod.POST)
    public String salvar(@Valid SessaoTrabalho sessao, Model model) {

        System.out.println(sessao);
        sessaoRepository.save(sessao);

        Iterable<SessaoTrabalho> historicoSessao = sessaoRepository.findAll();
        model.addAttribute("historicoSessao", historicoSessao);

        return "adms";
    }


}
