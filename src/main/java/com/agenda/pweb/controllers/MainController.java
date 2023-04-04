package com.agenda.pweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.pweb.dtos.ContatoDto;
import com.agenda.pweb.services.MainServices;

@RestController
public class MainController {

	@Autowired
	MainServices services;
	
	@GetMapping
	public List<ContatoDto> listPorNome(@PathVariable String nome){
			
		return services.listarPorNome(nome);
	}
}
