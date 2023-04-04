package com.agenda.pweb.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.pweb.entities.Contato;

public interface ContatoRepositoriy extends JpaRepository<Contato, Long> {

	public List<Contato> findByNome(String nome);
	
	public Optional<Contato> findById(Long Id);
}
