package com.uce.edu.ec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoDeberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("primera ejecucion de la app");
		System.out.println("segunda ejecucion de la app mismo branch");
	}

}
