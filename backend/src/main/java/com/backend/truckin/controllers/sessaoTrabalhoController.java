package com.backend.truckin.controllers;




import com.backend.truckin.models.*;
import com.backend.truckin.repositories.HorarioRepository;
import com.backend.truckin.repositories.SessaoRepository;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class sessaoTrabalhoController
{
    @Autowired
    private SessaoRepository sessaoRepository;
    IdManager classe = new IdManager();

    @RequestMapping("sessaoTrabalho")
    public String sessaoTrabalho()
    {
        System.out.println("Chegou" + classe.Id_Trabalho);
        return ("sessaoTrabalho");
    }
    @RequestMapping(value = "salvarHorario", method = RequestMethod.POST)
    public String salvarHorario(@Valid SessaoTrabalho updateTrab, Model model)
    {
        long id = classe.Id_Trabalho;
        long status = 1;
        updateTrab.setId(id);
        SessaoTrabalho user = sessaoRepository.findById(id);
        updateTrab.setNomeCliente(user.getNomeCliente());
        updateTrab.setIdMot(user.getIdMot());
        updateTrab.setIdPac(user.getIdPac());
        updateTrab.setTituloTrab(user.getTituloTrab());
        updateTrab.setVeiculo(user.getVeiculo());
        updateTrab.setStatus(status);
        sessaoRepository.save(updateTrab);
        System.out.println(updateTrab);
        return "sessaoTrabalho";
    }


}

