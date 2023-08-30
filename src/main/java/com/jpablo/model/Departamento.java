package com.jpablo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Departamento {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String jefe;
	private String empleados;
	
	public Departamento(Long id,String nombre, String jefe, String empleados) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.jefe = jefe;
		this.empleados = empleados;
	}
	
	public Departamento() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getJefe() {
		return jefe;
	}
	public void setJefe(String jefe) {
		this.jefe = jefe;
	}
	public String getEmpleados() {
		return empleados;
	}
	public void setEmpleados(String empleados) {
		this.empleados = empleados;
	}
	
	
	
}

