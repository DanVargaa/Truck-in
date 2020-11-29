package com.backend.truckin.controllers;

import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.SessaoTrabalho;
import com.backend.truckin.models.User;
import com.backend.truckin.repositories.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class ResumoSalarioController {
    @Autowired
    private SessaoRepository sessaoRepository;
    IdManager classe = new IdManager();


    @RequestMapping("resumoMesUsu")
    public String resumoSalario() throws ParseException {
    getMes();
        return ("resumoMesUsu");

    }
        @RequestMapping(value="buscaMes", method = RequestMethod.GET)
        public String getMes() throws ParseException {
        long id = classe.Id_PerfilUsu;
        long status = 1;
        System.out.println("Chegou -- " + classe.Id_PerfilUsu);
            SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
            Date data1 = formato1.parse("20/11/2020");
            Timestamp ts=new Timestamp(data1.getTime());
            SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
            Date data2 = formato2.parse("30/11/2020");
            Timestamp ts2=new Timestamp(data2.getTime());
            System.out.println(data1);

        List<SessaoTrabalho> userSalario = sessaoRepository.findByCreated_AtAndIdMotBetween(data1, data2,classe.Id_PerfilUsu);
        if(userSalario.isEmpty() ){System.out.println("busca sem resultados");}
        for (SessaoTrabalho i:userSalario) {
            System.out.println(i.getHi());
        }
        Double horaInicial = 0.0;
        Double horaFinal = 0.0;
        Double descansoInicial = 0.0;
        Double descansoFinal = 0.0;
        Double usoInicial = 0.0;
        Double usoFinal = 0.0;
        Double salarioHora = 10.0;
        Double somaSalario = 0.0;
        /*horaInicial.parseDouble(userSalario.getHi().replaceAll(":", ""));
        horaFinal.parseDouble(userSalario.getHf().replaceAll(":", ""));
        descansoInicial.parseDouble(userSalario.getDi().replaceAll(":", ""));
        descansoFinal.parseDouble(userSalario.getDf().replaceAll(":", ""));
        usoInicial.parseDouble(userSalario.getPi().replaceAll(":", ""));
        usoFinal.parseDouble(userSalario.getPf().replaceAll(":", ""));

        System.out.println(horaFinal+" "+horaInicial+" "+descansoFinal+" "+
                descansoInicial+" "+usoInicial+" "+usoFinal);*/

        return ("resumoMesUsu");

}


}
