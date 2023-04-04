package com.agenda.pweb.dtos;

import com.agenda.pweb.entities.Contato;

public class ContatoDto {
	private Long id;
	private String nome;
	private String email;

	public ContatoDto() {
	}
	
	public ContatoDto(Contato contato) {
		this.id= contato.getId();
		this.nome = contato.getNome();
		this.email = contato.getEmail();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}