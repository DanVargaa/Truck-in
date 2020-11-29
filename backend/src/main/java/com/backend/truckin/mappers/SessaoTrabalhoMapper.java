package com.backend.truckin.mappers;

import com.backend.truckin.controllers.forms.SessaoTrabalhoForm;
import com.backend.truckin.models.SessaoTrabalho;
import com.backend.truckin.utils.DateUtils;

public class SessaoTrabalhoMapper {
    public SessaoTrabalho map(SessaoTrabalho sessaoTrabalhoUpdate, SessaoTrabalhoForm sessaoTrabalhoForm){

        sessaoTrabalhoUpdate.setNomeCliente(sessaoTrabalhoForm.getNomeCliente());

        sessaoTrabalhoUpdate.setPi(DateUtils.stringToCalendar(sessaoTrabalhoForm.getPi(),"hh:mm"));
        sessaoTrabalhoUpdate.setDi(DateUtils.stringToCalendar(sessaoTrabalhoForm.getDi(),"hh:mm"));
        sessaoTrabalhoUpdate.setHi(DateUtils.stringToCalendar(sessaoTrabalhoForm.getHi(),"hh:mm"));
        sessaoTrabalhoUpdate.setPf(DateUtils.stringToCalendar(sessaoTrabalhoForm.getPf(),"hh:mm"));
        sessaoTrabalhoUpdate.setHf(DateUtils.stringToCalendar(sessaoTrabalhoForm.getHf(),"hh:mm"));
        sessaoTrabalhoUpdate.setDf(DateUtils.stringToCalendar(sessaoTrabalhoForm.getDf(),"hh:mm"));

        return sessaoTrabalhoUpdate;

    }
}
