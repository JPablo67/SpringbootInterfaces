package com.jpablo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tienda {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String ciudad;
	private String telefono;
    
	public Tienda(Long id,String name, String ciudad, String telefono) {
		super();
		this.id = id;
		this.name = name;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}
	
	public Tienda() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getTelefono() {
		return telefono;
	}

	
    
}


