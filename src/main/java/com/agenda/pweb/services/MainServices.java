package com.agenda.pweb.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.pweb.dtos.ContatoDto;
import com.agenda.pweb.entities.Contato;
import com.agenda.pweb.repositories.ContatoRepositoriy;
import com.agenda.pweb.repositories.NumeroRepository;

@Service
public class MainServices {
	
	@Autowired
	private ContatoRepositoriy contatoRepo;
	
	@Autowired
	private NumeroRepository numeroRepo;
	
	public List<ContatoDto> listarPorNome(String nome){
		List<Contato> contatoList = contatoRepo.findByNome(nome);
		return contatoList.stream().map(ContatoDto::new).collect(Collectors.toList());
		
	}

}
