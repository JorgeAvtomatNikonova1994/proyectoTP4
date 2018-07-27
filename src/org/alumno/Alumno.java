package org.alumno;

import javax.persistence.*;

import org.espacio_utilizado.*;
import org.preceptor.*;
import org.profesor.*;

@Entity
public class Alumno extends Persona{
	@Id
	private int cod_alumno;
	private String nombre;
	private String apellido;
	
	/*GETTERS AND SETTERS*/
	
}
