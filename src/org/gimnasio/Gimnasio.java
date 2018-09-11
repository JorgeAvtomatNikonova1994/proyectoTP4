package org.gimnasio;

import javax.persistence.*;

import org.espacio_utilizado.*;
import org.openxava.annotations.*;

@Entity
public class Gimnasio extends Espacio_utilizado {
	@Id @Required @Column(length=5)
	private int cod_gimnasio;
	
	
	
	
	/*GETTERS AND SETTERS*/
	public int getCod_gimnasio() {
		return cod_gimnasio;
	}

	public void setCod_gimnasio(int cod_gimnasio) {
		this.cod_gimnasio = cod_gimnasio;
	}

	

}
