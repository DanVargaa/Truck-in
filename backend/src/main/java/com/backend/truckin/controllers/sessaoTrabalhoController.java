package com.backend.truckin.controllers;

import com.backend.truckin.models.HorarioTrab;
import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.LOG;
import com.backend.truckin.models.SessaoTrabalho;
import com.backend.truckin.repositories.HorarioRepository;
import com.backend.truckin.repositories.LOGRepository;
import com.backend.truckin.repositories.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class SessaoTrabalhoController {
    private IdManager classe = new IdManager();
    @Autowired
    private SessaoRepository sessaoRepository;
    @Autowired
    private LOGRepository logRepository;

    @RequestMapping("sessaoTrabalho")
    public String sessoes(Model model) {
        System.out.println("entrou nesse método sessão de trabalho");
        return "sessaoTrabalho";
    }

    @RequestMapping(value = "salvarHorario", method = RequestMethod.POST)
    public String salvar(@Valid SessaoTrabalho horario, Model model) {
        LOG logSessaoDeTrabalho = new LOG();
        logSessaoDeTrabalho.setAcaoEfetuada("Completou sua sessão de trabalho" );
        logSessaoDeTrabalho.setIdAdm(classe.Id_Adm);
        logSessaoDeTrabalho.setIdUser(classe.Id_PerfilUsu);
        logRepository.save(logSessaoDeTrabalho);

            String PerfilId = String.valueOf(classe.Id_PerfilUsu);
            System.out.println(horario);
            sessaoRepository.save(horario);
            Iterable<SessaoTrabalho> horas =  sessaoRepository.findAll();
            model.addAttribute("horas", horas);
            return "sessaoTrabalho";
        }


}
