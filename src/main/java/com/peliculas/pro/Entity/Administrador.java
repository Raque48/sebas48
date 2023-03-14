package com.peliculas.pro.Entity;

public class Administrador {
	private Integer id;
	private String nombre;
	private String Apellidos;
	private String correo;
	private String contraseña;
	
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "Administrador [id=" + id + ", nombre=" + nombre + ", Apellidos=" + Apellidos + ", correo=" + correo + ", contraseña=" + contraseña + "]";
	}
	
	
}
