package com.peliculas.pro.Service;

import java.util.List;

import com.peliculas.pro.Entity.Administrador;

public interface IntAdministradoresService {
	
	public void guardar(Administrador administrador);
	public List<Administrador> ObtenerAdmin();
	public Administrador buscarPorId(Integer idAdminitrador);
	public void eliminiar(Integer idAdminitrador);
	
	
}
