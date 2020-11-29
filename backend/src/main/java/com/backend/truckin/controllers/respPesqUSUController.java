package com.backend.truckin.controllers;

import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.LOG;
import com.backend.truckin.models.User;
import com.backend.truckin.models.Veiculo;
import com.backend.truckin.repositories.LOGRepository;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class respPesqUSUController
{

    @Autowired
    UserRepository userRepository;
    IdManager classe = new IdManager();
    @Autowired
    LOGRepository logRepository;


    @RequestMapping("respPesqUSU")
    public String respNome(Model model){
        LOG logSessaoDeTrabalho = new LOG();
        logSessaoDeTrabalho.setAcaoEfetuada("Pesquisou um usuario específico");
        logSessaoDeTrabalho.setIdAdm(classe.Id_Adm);
        logSessaoDeTrabalho.setIdUser(classe.Id_PerfilUsu);
        logRepository.save(logSessaoDeTrabalho);
        System.out.println(classe.Id_Adm +" Este usuário verficiou os dados dos usuários " + classe.NomePesqUsu);
        Iterable<User> respNome = userRepository.findAllByName(classe.NomePesqUsu);
        model.addAttribute("respPesqUSU", respNome);
        return "redirect:/allUsers";
    }


}
