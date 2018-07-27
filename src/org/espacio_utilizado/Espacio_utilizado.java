package org.espacio_utilizado;

import javax.persistence.*;

@MappedSuperclass
public class Espacio_utilizado {
	private int capacidad;
	private int horario;
	private String descripcion;
	
	/*GETTERS AND SETTERS*/
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

	
}
