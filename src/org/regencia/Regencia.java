package org.regencia;

import javax.persistence.*;

import org.escuela.*;
import org.persona.*;

@Entity
public class Regencia {
	@Id @Column(length=5) 
	private int cod_regencia;
	private String horario_de_regencia;
	@Column(length=30)
	private Escuela nombre_escuela;
	
	@ManyToOne
	private Persona persona;
	@OneToOne
	private Escuela escuela;
	
	
	public int getCod_regencia() {
		return cod_regencia;
	}
	public void setCod_regencia(int cod_regencia) {
		this.cod_regencia = cod_regencia;
	}
	public String getHorario_de_regencia() {
		return horario_de_regencia;
	}
	public void setHorario_de_regencia(String horario_de_regencia) {
		this.horario_de_regencia = horario_de_regencia;
	}
	public Escuela getNombre_escuela() {
		return nombre_escuela;
	}
	public void setNombre_escuela(Escuela nombre_escuela) {
		this.nombre_escuela = nombre_escuela;
	}
	
}
