package com.backend.truckin.controllers;

import com.backend.truckin.models.Veiculo;
import com.backend.truckin.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class allVeiculosController {
    @Autowired
    VeiculoRepository veiculoRepository;

    @RequestMapping("allVeiculos")
    public String allVeiculos(Model model){
        System.out.println("entrou nesse método allveiculos");
        Iterable<Veiculo> allVeiculos = veiculoRepository.findAll();
        model.addAttribute("allVeiculos", allVeiculos);

        return "allVeiculos";
    }
}
