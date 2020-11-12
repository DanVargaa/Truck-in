package com.backend.truckin.controllers;


import com.backend.truckin.models.User;
import com.backend.truckin.repositories.UserRepository;
import net.bytebuddy.build.BuildLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
public class UserController{

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("users")
    public String users(Model model){
        System.out.println("entrou nesse método users");
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);

        return "users";
    }

    @RequestMapping(value= "salvar", method = RequestMethod.POST)
            public String salvar(@Valid User user, Model model){

        System.out.println("entrou nesse método");
         userRepository.save(user);

        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);

        return "users";
    }


}