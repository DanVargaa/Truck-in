package com.backend.truckin.controllers;

import com.backend.truckin.models.User;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class allUsersController  {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("allUsers")
    public String allUsers(Model model){
        System.out.println("entrou nesse método allusers");
        Iterable<User> allUsers = userRepository.findAll();
        model.addAttribute("allUsers", allUsers);

        return "allUsers";
    }
}
