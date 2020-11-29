package com.backend.truckin.controllers;

import com.backend.truckin.models.IdManager;
import com.backend.truckin.models.ResumoSalario;
import com.backend.truckin.models.SessaoTrabalho;
import com.backend.truckin.models.User;
import com.backend.truckin.repositories.SessaoRepository;
import com.backend.truckin.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class ResumoSalarioController {
    @Autowired
    private SessaoRepository sessaoRepository;
    IdManager classe = new IdManager();


    @RequestMapping("resumoMesUsu")
    public String resumoSalario() throws ParseException {

        return ("resumoMesUsu");

    }
        @RequestMapping(value="buscaMes", method = RequestMethod.GET)
        public String getMes(String mes, Model model ) throws ParseException {
        long id = classe.Id_PerfilUsu;
        long status = 1;
           Calendar ini =  DateUtils.getFirstDay(Integer.valueOf(mes));
           Calendar end =  DateUtils.getLastDay(Integer.valueOf(mes));

        List<SessaoTrabalho> userSalario = sessaoRepository.findByCreated_AtAndIdMotBetween(ini, end,classe.Id_PerfilUsu);
        if(userSalario.isEmpty() ){System.out.println("busca sem resultados");}

        Double totalRegularHours = 0d;
            Double totalExtraHours = 0d;
            Double salarioHora = 10d;
            Double salarioHOraExtra = 1.10;
        for (SessaoTrabalho i:userSalario) {
            Long currentHours =0l;
            currentHours = DateUtils.sumHours(i.getHi(),i.getHf());
           if(currentHours > 8){

               totalRegularHours += 8d;
               totalExtraHours += currentHours - 8d;
               totalExtraHours = (totalExtraHours/1000d)/60d/60d;
           }else{
               totalRegularHours += currentHours;
               totalRegularHours = (totalRegularHours/1000d)/60d/60d;
           }
        }


        Double total = totalRegularHours + (totalExtraHours * salarioHOraExtra) ;
        Double ganhos = total * salarioHora;
        ResumoSalario resumoSalario = new ResumoSalario(totalRegularHours,totalExtraHours, ganhos);

        model.addAttribute("resSal", resumoSalario );

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
