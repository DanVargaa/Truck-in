package com.backend.truckin.controllers;

import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.User;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class allUsersController  {
    @Autowired
    UserRepository userRepository;
    IdManager classe = new IdManager();
    @RequestMapping("allUsers")
    public String allUsers(Model model){
        System.out.println(classe.Id_Adm +" Esse usuário fez a pesquisa de todos os usuários");
        Iterable<User> allUsers = userRepository.findAll();
        model.addAttribute("allUsers", allUsers);

        return "allUsers";
    }

    @GetMapping("pesqNome")
    public String pesquisarNome(String nome){

        System.out.println("Pesquisa");
        classe.NomePesqUsu = nome;
        System.out.println(classe.NomePesqUsu);
        return "redirect:/respPesqUSU";
    }
}
