package com.gregpalacios.app.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersona;

	@NotNull
	@Size(min = 3, message = "{nombres.size}")
	@Column(name = "nombres", nullable = false, length = 100)
	private String nombres;
		
	@NotNull
	@Size(min = 3, message = "{apellidos.size}")
	@Column(name = "apellidos", nullable = false, length = 100)
	private String apellidos;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}
	
}
