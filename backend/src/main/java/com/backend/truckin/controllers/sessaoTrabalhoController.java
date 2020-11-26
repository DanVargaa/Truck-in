package com.backend.truckin.controllers;




import com.backend.truckin.models.HorarioTrab;
import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.User;
import com.backend.truckin.models.Veiculo;
import com.backend.truckin.repositories.HorarioRepository;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class sessaoTrabalhoController
{
    @Autowired
    private HorarioRepository HorarioRepository;
    IdManager classe = new IdManager();

    @RequestMapping("sessaoTrabalho")
    public String sessaoTrabalho()
    {

        return ("sessaoTrabalho");
    }
    @RequestMapping(value = "salvarHorario", method = RequestMethod.POST)
    public String salvarHorario(@Valid HorarioTrab horario, Model model)
    {
        String PerfilId = String.valueOf(classe.Id_PerfilUsu);
        System.out.println(horario);
        HorarioRepository.save(horario);
        Iterable<HorarioTrab> horas = HorarioRepository.findAll();
        model.addAttribute("horas", horas);
        return "sessaoTrabalho";
    }
}

