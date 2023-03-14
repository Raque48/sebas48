package com.peliculas.pro.Entity;

import java.time.LocalDate;

public class Pelicula {
	private Integer id;
	private String nombrePeli;
	private String descripcion;
	private String autor;
	private LocalDate fecha;
	private Double precio_salida;
	private String imagen;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombrePeli() {
		return nombrePeli;
	}
	public void setNombrePeli(String nombrePeli) {
		this.nombrePeli = nombrePeli;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Double getPrecio_salida() {
		return precio_salida;
	}
	public void setPrecio_salida(Double precio_salida) {
		this.precio_salida = precio_salida;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombrePeli=" + nombrePeli + ", descripcion=" + descripcion + ", autor=" + autor
				+ ", fecha=" + fecha + ", precio_salida=" + precio_salida + ", imagen=" + imagen + "]";
	}
	
}
