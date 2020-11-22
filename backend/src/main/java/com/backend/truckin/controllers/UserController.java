package com.backend.truckin.controllers;


import com.backend.truckin.models.User;
import com.backend.truckin.repositories.UserRepository;
import net.bytebuddy.build.BuildLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@EnableScheduling
@Controller
public class UserController{

    @Autowired
    private UserRepository userRepository;

    @Scheduled(
            cron = "0,10 * * * * *")
    public void cronJob() {
        System.out.println("teste");
        //Datetime
        //if inicio não pressionado, lembrete(alert), pressionou? salva no banco
        // if botão de descanso, não foi pressionar, avisa,
        //if retorno
        //if final sessão - entra um método que vai  somar horas trabalhadas (transformar
        // MARCAÇÃO DE HORA EXTRA
        //Datetime em Double. Horas = 80km/h 640kmh - Pacote 5.000
        // Add scheduled logic here

    }

    @RequestMapping("users")
    public String users(Model model){
        System.out.println("entrou nesse método users");

        cronJob();
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