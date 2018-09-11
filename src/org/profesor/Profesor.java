package org.profesor;

import javax.persistence.*;
import org.espacio_utilizado.*;
import org.persona.*;
import org.programa.*;

@Entity
public class Profesor extends Persona {
	@Id @Column(length=5)
	private int cod_profesor;
	@Column(length=30)
	private String materia;
	@Column(length=30)
	private Espacio_utilizado utiliza;
	HACER RELACION
	@ManyToOne
	private Programa progra;
	
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
	public Espacio_utilizado getUtiliza() {
		return utiliza;
	}
	public void setUtiliza(Espacio_utilizado utiliza) {
		this.utiliza = utiliza;
	}
	

}
