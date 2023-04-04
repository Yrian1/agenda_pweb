package com.agenda.pweb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.pweb.entities.Numero;

public interface NumeroRepository extends JpaRepository<Numero, Long>{
	
	public List<Numero> findByContatoId(Long contatoId);
}
