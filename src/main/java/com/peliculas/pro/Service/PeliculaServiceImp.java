package com.peliculas.pro.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.peliculas.pro.Entity.Cliente;
import com.peliculas.pro.Entity.Pelicula;

@Service
public class PeliculaServiceImp implements IntPeliculaService{
	
	private List<Pelicula> peliculas;
	
	public PeliculaServiceImp() {
		peliculas = new LinkedList<>();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		Pelicula c1 = new Pelicula();
		c1.setId(1);
		c1.setNombrePeli("Avenger");
		c1.setDescripcion("Los Heroes mas poderosos del mundo se enfrentas a una amenza proveniente del hermano de Thor, Loki que busca imvadir la tierra, seran capas nuestros heroes de detener esta gran amenzasa");
		c1.setAutor("Marvel");
		c1.setFecha(LocalDate.parse("27-04-2012", formato));
		c1.setPrecio_salida(90.50);
		c1.setImagen("dinosaurio.png");
		
		peliculas.add(c1);
	}
	
	@Override
	public void guardar(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
	@Override
	public void eliminar(Integer idPelicula) {
		peliculas.remove(buscarPorId(idPelicula));
		
	}
	
	@Override
	public Pelicula buscarPorId(Integer idPelicula) {
		for(Pelicula c: peliculas) {
			if(c.getId().compareTo(idPelicula)==0) {
				return c;
			}
		}
		return null;
	}
	
	@Override
	public List<Pelicula> obtenerPelicula() {
		return peliculas;
	}
	
	@Override
	public int numeroPeli() {
		return peliculas.size();
	}
}
