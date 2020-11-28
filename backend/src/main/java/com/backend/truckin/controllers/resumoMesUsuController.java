package com.backend.truckin.controllers;


import com.backend.truckin.models.SessaoTrabalho;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class resumoMesUsuController {

    @RequestMapping("resumoMesUsu")
    public String resumoMes(Model model){



        return "resumoMesUsu";
    }
}
