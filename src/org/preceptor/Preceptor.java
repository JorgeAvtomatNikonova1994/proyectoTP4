package org.preceptor;

import javax.persistence.*;
import org.persona.*;
import org.regencia.*;

@Entity
public class Preceptor extends Persona {
	@Id @Column(length=5)
	private int cod_preceptor;
	@Column(length=30)
	private Regencia zona_regencia;
	
	
	public int getCod_preceptor() {
		return cod_preceptor;
	}
	public void setCod_preceptor(int cod_preceptor) {
		this.cod_preceptor = cod_preceptor;
	}
	public Regencia getZona_regencia() {
		return zona_regencia;
	}
	public void setZona_regencia(Regencia zona_regencia) {
		this.zona_regencia = zona_regencia;
	}
	
	
	

	/*GETTERS AND SETTERS*/

	}

}
