package com.agenda.pweb.dtos;

import com.agenda.pweb.entities.Categorias;

public class NumeroDto {
	private Long id;
	private Long telefone;
	private Categorias categoria;
	private long contato;

	public NumeroDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public long getContato() {
		return contato;
	}

	public void setContato(long contato) {
		this.contato = contato;
	}
}