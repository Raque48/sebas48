package com.peliculas.pro.Entity;

public class Administrador {
	private Integer id;
	private String nombre;
	private String Apellidos;
	private String correo;
	private String contrasena;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	@Override
	public String toString() {
		return "Administrador [id=" + id + ", nombre=" + nombre + ", Apellidos=" + Apellidos + ", correo=" + correo + ", contrasena=" + contrasena + "]";
	}
	
	
}
