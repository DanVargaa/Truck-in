package com.backend.truckin.controllers;

import com.backend.truckin.models.Veiculo;
import com.backend.truckin.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class VeiculoController{

    @Autowired
    private VeiculoRepository veiculoRepository;
    @RequestMapping("veiculos")
    public String veiculos(Model model) {
        System.out.println("entrou nesse método veiculos");
        return "veiculos";
    }


    @RequestMapping(value = "salvarVeiculo", method = RequestMethod.POST)
    public String salvarVeiculo(@Valid Veiculo veiculo, Model model) {

        System.out.println(veiculo);
        veiculoRepository.save(veiculo);

        Iterable<Veiculo> veiculos = veiculoRepository.findAll();
        model.addAttribute("veiculos", veiculos);

        return "veiculos";
    }


}