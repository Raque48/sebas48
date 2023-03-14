package com.peliculas.pro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peliculas.pro.Entity.Pelicula;
import com.peliculas.pro.Service.IntPeliculaService;

@Controller
public class UsuarioController {
	
	@Autowired
	private IntPeliculaService servicePelicula;

	@GetMapping("/Home")
	public String casa() {
		return "index";
	}
	
	@GetMapping("/Alto")
	public String alto() {
		return "admin";
	}
	
	@GetMapping("/Bajo")
	public String registro() {
		return "inicio";
	}
	
	@GetMapping("/formulario")
	public String inicio() {
		return "form";
	}
	
	
}
