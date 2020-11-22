package com.backend.truckin.controllers;
import java.util.Collection;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component
//@EnableScheduling
public class TesteTempo {

    private Logger logger = LoggerFactory.getLogger(this.getClass());



    /*@Scheduled(
            cron = "0,30 * * * * *")*/
    public void cronJob() {
        System.out.println("teste");

        // Add scheduled logic here

    }

    /*@Scheduled(
            initialDelay = 5000,
            fixedRate = 15000)*/
    public void fixedRateJobWithInitialDelay() {
        System.out.println("teste1");

        // Add scheduled logic here
        // Simulate job processing time
        long pause = 5000;
        long start = System.currentTimeMillis();
        do {
            if (start + pause < System.currentTimeMillis()) {
                break;
            }
        } while (true);
        System.out.println("teste1A");
    }

    /*@Scheduled(
            initialDelay = 5000,
            fixedDelay = 15000)*/
    public void fixedDelayJobWithInitialDelay() {
        System.out.println("teste2");

        // Add scheduled logic here
        // Simulate job processing time
        long pause = 5000;
        long start = System.currentTimeMillis();
        do {
            if (start + pause < System.currentTimeMillis()) {
                break;
            }
        } while (true);
        System.out.println("teste2A");
    }

}
