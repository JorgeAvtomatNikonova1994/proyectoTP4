package org.aula_comun;

import javax.persistence.*;

import org.espacio_utilizado.*;
import org.openxava.annotations.*;

public class Aula_comun extends Espacio_utilizado {
	@Id @Column(length=5) @Required
	private int cod_aula_comun;
	@Column(length=35) @Required
	private String descripcion;
	
	public int getCod_aula_comun() {
		return cod_aula_comun;
	}
	public void setCod_aula_comun(int cod_aula_comun) {
		this.cod_aula_comun = cod_aula_comun;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
/*GETTERS AND SETTERS*/

	
}
