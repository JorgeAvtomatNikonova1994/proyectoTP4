package org.alumno;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.persona.*;


@Entity
public class Alumno extends Persona{
	@Id @Column(length=5) @Required
	private int cod_alumno;
	@Column(length=30) @Required
	private String nombre;
	@Column(length=30) @Required
	private String apellido;
	
	
	public int getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(int cod_alumno) {
		this.cod_alumno = cod_alumno;
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
	
	/*GETTERS AND SETTERS*/

	
}
