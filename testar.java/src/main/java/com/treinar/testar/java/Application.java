package com.treinar.testar.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um texto aqui: ");
		String texto = scanner.nextLine();

		System.out.println("Sua frase é: " + texto);

			int vog =0, cons = 0;

		texto = texto.toLowerCase();
		for(int i = 0; i < texto.length(); i++){

		}
	}




}
