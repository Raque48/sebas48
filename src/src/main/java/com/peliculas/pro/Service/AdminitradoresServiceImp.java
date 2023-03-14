package com.peliculas.pro.Service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.peliculas.pro.Entity.Administrador;

@Service
public class AdminitradoresServiceImp implements IntAdministradoresService{
	
	private List<Administrador> adminitradores;
	
	public AdminitradoresServiceImp() {
		adminitradores = new LinkedList<>();
		
		Administrador c1 = new Administrador();
		c1.setId(1);
		c1.setNombre("Sebastian");
		c1.setApellidos("Santiago Perez");
		c1.setCorreo("sspsantiago15@gmail.com");
		c1.setContrasena("sebitas21");
		
		Administrador c2 = new Administrador();
		c2.setId(2);
		c2.setNombre("Christian Jovani");
		c2.setApellidos("Carmona Hernandez");
		c2.setCorreo("chrisSpider@gmail.com");
		
		adminitradores.add(c1);
		adminitradores.add(c2);
	}
	
	@Override
	public Administrador buscarPorId(Integer idAdminitrador) {
		for(Administrador c: adminitradores) {
			if(c.getId().compareTo(idAdminitrador)==0) {
				return c;
			}
		}
		return null;
	}
	
	@Override
	public void guardar(Administrador administrador) {
		adminitradores.add(administrador);
	}
	
	@Override
	public List<Administrador> ObtenerAdmin() {
		return adminitradores;
	}
	
	@Override
	public void eliminiar(Integer idAdminitrador) {
		adminitradores.remove(buscarPorId(idAdminitrador));
		
	}
	
}
