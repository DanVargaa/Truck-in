package com.backend.truckin;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@SpringBootApplication
public class TruckinApplication {
	public static void main(String[] args) {
		SpringApplication.run(TruckinApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "login";
	}


}

