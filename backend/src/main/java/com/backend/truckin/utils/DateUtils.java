package com.backend.truckin.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
//SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//        String dateInString = "22-01-2015 10:20:56";
//        Date date = sdf.parse(dateInString);
    public static Calendar stringToCalendar(String date, String format){
        Calendar calendar = Calendar.getInstance();
        try {
            SimpleDateFormat formato1 = new SimpleDateFormat(format);
            Date convertedDate = null;
            convertedDate = formato1.parse(date);
            calendar.setTime(convertedDate);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        return calendar;
    }
    public static Calendar getFirstDay(Integer mes){
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(Calendar.YEAR);
        calendar.set(year,mes,1);
        Calendar result = Calendar.getInstance();
        result.setTime(calendar.getTime());
        return result;
    }
    public static Calendar getLastDay(Integer mes){
     Calendar last = Calendar.getInstance();
    Integer lastDay =  Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
    last.set(last.get(Calendar.YEAR), mes, lastDay);
        Calendar result = Calendar.getInstance();
        result.setTime(last.getTime());
        return result;
    }
    public static Long sumHours(Calendar ini, Calendar end){
        long horaInicialMillis = ini.getTimeInMillis();
        long horaFinalMillis = end.getTimeInMillis();
        Long total = horaFinalMillis - horaInicialMillis;
        return total;
    }
}
