package org.persona;

import javax.persistence.*;

import org.escuela.*;

@Entity
public class Persona {
	private String nombre;
	private String apellido;
	Escuela cod_escuela;
	
}
