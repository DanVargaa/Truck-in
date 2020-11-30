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
        long id= classe.Id_PerfilUsu;
        Iterable<SessaoTrabalho> histTrab = sessaoRepository.findByIdMotAndStatus(id,1);
        model.addAttribute("histTrab", histTrab);
        return "historicoSessao";
    }

}
