package com.backend.truckin.controllers;

import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.SessaoTrabalho;
import com.backend.truckin.models.Veiculo;
import com.backend.truckin.repositories.SessaoRepository;
import com.backend.truckin.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class listTrabalhoController
{
    @Autowired
    SessaoRepository sessaoRepository;
    IdManager classe = new IdManager();

    @RequestMapping("listaTrabalho")
    public String listTrabalhos(Model model){
        long id= classe.Id_PerfilUsu;
        Iterable<SessaoTrabalho> listTrab = sessaoRepository.findByIdMotAndStatus(id,0);
        model.addAttribute("listTrab", listTrab);
        return "listaTrabalho";
    }
    @RequestMapping("salvarID")
    public String salvarID(String idTrab){
        classe.Id_Trabalho = Long.parseLong(idTrab);
        System.out.println(classe.Id_Trabalho);
        return "redirect:/sessaoTrabalho";
    }


}
