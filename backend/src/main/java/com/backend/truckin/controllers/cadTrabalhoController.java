package com.backend.truckin.controllers;


import com.backend.truckin.models.*;
import com.backend.truckin.repositories.*;
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
    LOGRepository logRepository;

    @Autowired
    VeiculoRepository veiculoRepository;

    @Autowired
    PacoteRepository pacoteRepository;

    @RequestMapping("cadTrabalho")
    public String cadTrabalho(Model model, Model model2, Model model3)
    {
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
        LOG logSessaoDeTrabalho = new LOG();
        logSessaoDeTrabalho.setAcaoEfetuada("Construiu a Sessão de trabalho");
        logSessaoDeTrabalho.setIdAdm(classe.Id_Adm);
        logSessaoDeTrabalho.setIdUser(sessaoTrabalho.getIdMot());
        logRepository.save(logSessaoDeTrabalho);


        System.out.println(sessaoTrabalho);
        sessaoTrabalho.setStatus((long) 0);
        sessaoRepository.save(sessaoTrabalho);
        Iterable<SessaoTrabalho> cadSessao = sessaoRepository.findAll();
        model.addAttribute("cadTrabalho", cadSessao);

        return "cadTrabalho";
    }





}