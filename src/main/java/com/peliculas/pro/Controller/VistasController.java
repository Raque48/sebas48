package com.peliculas.pro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vistas")
public class VistasController {

	
	@GetMapping("/Home1")
	public String usuario() {
		return "vistas/index";
	}
	
	@GetMapping("/Lista")
	public String Catalogo() {
		return "vistas/catalogo";
	}
	
	@GetMapping("/Accion")
	public String Accion() {
		return "vistas/accion";
	}
	
	@GetMapping("/Reserva")
	public String Reserva() {
		return "vistas/reserva";
	}
}
