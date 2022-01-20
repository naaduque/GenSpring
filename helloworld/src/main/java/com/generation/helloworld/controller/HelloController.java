package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/2")
	public String hello2() {
		return "Olá família 41";
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "\tMentalidades que utilizamos para realizar a atividade: Persistência, Atenção aos detalhes e Orientação ao futuro";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "O objetivo dessa semana foi dar início a utilização do Spring e banco de dados, afim de facilitar a criação do nosso projeto integrador";
	}
}
