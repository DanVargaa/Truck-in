package com.backend.truckin.controllers;


import com.backend.truckin.models.*;
import com.backend.truckin.repositories.PacoteRepository;
import com.backend.truckin.repositories.SessaoRepository;
import com.backend.truckin.repositories.UserRepository;
import com.backend.truckin.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class cadTrabalhoController {

    @Autowired
    UserRepository userRepository;
    IdManager classe = new IdManager();

    @Autowired
    SessaoRepository sessaoRepository;

    @Autowired
    VeiculoRepository veiculoRepository;

    @Autowired
    PacoteRepository pacoteRepository;

    @RequestMapping("cadTrabalho")
    public String cadTrabalho(Model model, Model model2, Model model3)
    {
        System.out.println(classe.Id_Adm +" Esse usuário fez a pesquisa de todos os usuários, veículos e pacotes pelas DDLs da página cadTrabalho");
        Iterable<User> cadTrabalho = userRepository.findAll();
        Iterable<Veiculo> veiculo =  veiculoRepository.findAll();
        Iterable<Pacote> pacote = pacoteRepository.findAll();
        model.addAttribute("mot", cadTrabalho);
        model2.addAttribute("vei",veiculo);
        model3.addAttribute("pac",pacote);
        return "cadTrabalho";
    }


    @RequestMapping(value = "cadSessao", method = RequestMethod.POST)
    public String cadSessao(@Valid SessaoTrabalho sessaoTrabalho, Model model) {
        System.out.println(sessaoTrabalho);
        sessaoTrabalho.setStatus((long) 0);
        sessaoRepository.save(sessaoTrabalho);
        Iterable<SessaoTrabalho> cadSessao = sessaoRepository.findAll();
        model.addAttribute("cadTrabalho", cadSessao);
        System.out.println("Checa o banco ai");
        return "cadTrabalho";
    }





}