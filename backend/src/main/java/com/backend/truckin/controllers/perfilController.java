package com.backend.truckin.controllers;

import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.LOG;
import com.backend.truckin.models.User;
import com.backend.truckin.repositories.LOGRepository;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class perfilController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    LOGRepository logRepository;
    private IdManager classe = new IdManager();


    @RequestMapping("telaPerfil")
    public String perfil(Model model) {

        long PerfilId = classe.Id_PerfilUsu;
       System.out.println("entrou nesse método perfil :)");
        User perfil = userRepository.findById(PerfilId);
        model.addAttribute("telaPerfil", perfil);

        return "telaPerfil";
    }
}