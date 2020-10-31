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
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;

	@NotNull
	@Size(min = 2, message = "{nombre.size}")
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
		
	@NotNull
	@Size(min = 2, message = "{marca.size}")
	@Column(name = "marca", nullable = false, length = 100)
	private String marca;
	
	@NotNull
	@Column(name = "precio", nullable = false)
	private Double precio;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio
				+ "]";
	}
	
}
