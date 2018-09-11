package org.espacio_utilizado;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.persona.*;
import org.regencia.*;

@MappedSuperclass
public class Espacio_utilizado {
	@Id @Column(length=5) @Required
	private int cod_espacio_utilizado;
	@Column(length=10) @Required
	private int capacidad;
	@Required
	private int horario;
	@Column(length=100) @Required
	private String descripcion;
	
	
	@ManyToOne
	private Regencia regencia;
	
	@OneToMany
	private Persona persona;
	
	public int getCod_espacio_utilizado() {
		return cod_espacio_utilizado;
	}
	public void setCod_espacio_utilizado(int cod_espacio_utilizado) {
		this.cod_espacio_utilizado = cod_espacio_utilizado;   
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Regencia getCodigo_de_regencia() {
		return codigo_de_regencia;
	}
	public void setCodigo_de_regencia(Regencia codigo_de_regencia) {
		this.codigo_de_regencia = codigo_de_regencia;
	}
	
	
	/*GETTERS AND SETTERS*/

	
}
