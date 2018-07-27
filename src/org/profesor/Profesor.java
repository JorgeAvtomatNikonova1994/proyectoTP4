package org.profesor;

import javax.persistence.*;

import org.centroprofesores.*;
import org.espacio_utilizado.*;
@Entity
public class Profesor extends Centrodeprofesores {
	@Id 
	private int cod_profesor;
	private String materia;
	private int cantidad_de_clases;
	private Espacio_utilizado utiliza;
	
	/*GETTERS AND SETTERS*/
	public int getCod_profesor() {
		return cod_profesor;
	}
	public void setCod_profesor(int cod_profesor) {
		this.cod_profesor = cod_profesor;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getCantidad_de_clases() {
		return cantidad_de_clases;
	}
	public void setCantidad_de_clases(int cantidad_de_clases) {
		this.cantidad_de_clases = cantidad_de_clases;
	}
	public Espacio_utilizado getUtiliza() {
		return utiliza;
	}
	public void setUtiliza(Espacio_utilizado utiliza) {
		this.utiliza = utiliza;
	}

	
}
