package com.backend.truckin.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class cadTrabalhoController {


    @RequestMapping("cadTrabalho")
    public String cadTrabalho(String HoraInicial,String HoraFinal,String DescancoInicial,String DescancoFinal,String ForaInicial,String ForaFinal)
    {

        return "cadTrabalho";
    }

}