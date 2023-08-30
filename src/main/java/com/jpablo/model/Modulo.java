package com.jpablo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Modulo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int numero;
	private String categoria;
	private int tamanoM2;
    
	public Modulo(Long id, int numero, String categoria, int tamanoM2) {
		super();
		this.id = id;
		this.numero = numero;
		this.categoria = categoria;
		this.tamanoM2 = tamanoM2;
	}
	
	public Modulo() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setTamanom2(int tamanoM2) {
		this.tamanoM2 = tamanoM2;
	}
	
	public int getTamanoM2() {
		return tamanoM2;
	}
    
}
