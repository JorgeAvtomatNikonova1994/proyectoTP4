package org.programa;

import javax.persistence.*;

import org.profesor.*;



@Entity
public class Programa{
	@Id @Column(length=5)
	private int cod_programa;
	@Column(length=30)
	private String nombre;
	@Column(length=30)
	private String materia;
	@Column(length=2)
	private int cantidad_de_temas;
	@Column(length=5)
	private Profesor asignacion;
	
	@OneToMany
	private Profesor profe;
	
	public int getCod_programa() {
		return cod_programa;
	}
	public void setCod_programa(int cod_programa) {
		this.cod_programa = cod_programa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getCantidad_de_temas() {
		return cantidad_de_temas;
	}
	public void setCantidad_de_temas(int cantidad_de_temas) {
		this.cantidad_de_temas = cantidad_de_temas;
	}
	public Profesor getAsignacion() {
		return asignacion;
	}
	public void setAsignacion(Profesor asignacion) {
		this.asignacion = asignacion;
	}
	
	
}
