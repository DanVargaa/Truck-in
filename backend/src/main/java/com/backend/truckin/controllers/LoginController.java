package com.backend.truckin.controllers;

import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.User;
import com.backend.truckin.models.Adm;
import com.backend.truckin.repositories.AdmRepository;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class LoginController{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdmRepository admRepository;

    private IdManager classe = new IdManager();

    @RequestMapping("logIn")
    public String log(){
        return "logIn";
    }

    @GetMapping("login")
    public String login(String name,String senha){


        User usuario = new User();
        usuario = userRepository.findByName(name);

        Adm adm = new Adm();
        adm = admRepository.findByCellPhone(name);



        if(adm != null || usuario != null) {
            if (adm != null && adm.getCellPhone().equals(name) && adm.getSenha().equals(senha)) {
                System.out.println(adm.getId());
                classe.Id_Adm = adm.getId();
                return "redirect:/admActions";
            }

            else if(usuario != null && usuario.getName().equals(name) &&  usuario.getSenha().equals(senha))
            {
                System.out.println(usuario.getId());
             classe.Id_PerfilUsu = usuario.getId();
                return "redirect:/menuUser";

            }else{
                System.out.println("usuario ou senha não conferem");
                return null;
            }
        }
        else {
            System.out.println("usuario ou senha não conferem");
            return null;

        }
    }



}