package com.peliculas.pro.Service;

import java.util.List;

import com.peliculas.pro.Entity.Pelicula;

public interface IntPeliculaService {
	public void guardar(Pelicula pelicula);
	public List<Pelicula> obtenerPelicula();
	public Pelicula buscarPorId(Integer idPelicula);
	public void eliminar(Integer idPelicula);
	public int numeroPeli();
	
} 
