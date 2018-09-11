package org.escuela;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.persona.*;
import org.regencia.*;

@Entity
public class Escuela {
	@Id @Column(length=30) @Required
	private String nombre;
	@Column(length=20) @Required
	private String categoria;
	
	
	@OneToOne
	private Regencia regencia;
	@ManyToOne
	private Persona persona;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
