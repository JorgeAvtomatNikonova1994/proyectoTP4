package org.persona;

import javax.persistence.*;

import org.escuela.*;
import org.openxava.annotations.*;
import org.regencia.*;

@MappedSuperclass
public class Persona {
	@Id @Required
	private int cod_persona;
	@Column(length=30)@Required
	private String nombre;
	@Column(length=15)@Required
	private String rol;
	@Column(length=30)@Required
	private String apellido;

	
	@OneToMany
	private Regencia regencia;
	@OneToMany
	private Escuela escuela;
	
	
	public int getCod_persona() {
		return cod_persona;
	}
	public void setCod_persona(int cod_persona) {
		this.cod_persona = cod_persona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Escuela getCod_escuela() {
		return cod_escuela;
	}
	public void setCod_escuela(Escuela cod_escuela) {
		this.cod_escuela = cod_escuela;
	}
	public Regencia getCod_regencia() {
		return cod_regencia;
	}
	public void setCod_regencia(Regencia cod_regencia) {
		this.cod_regencia = cod_regencia;
	}
	
	
}

