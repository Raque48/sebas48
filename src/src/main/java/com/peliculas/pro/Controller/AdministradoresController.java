package com.peliculas.pro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peliculas.pro.Entity.Administrador;
import com.peliculas.pro.Service.IntAdministradoresService;

@Controller
@RequestMapping("/administradores")
public class AdministradoresController {
	
	@Autowired
	private IntAdministradoresService adminservice;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Administrador> administradores = adminservice.ObtenerAdmin();
		model.addAttribute("administradores", administradores);
		return "administradores/listaAdmin";
	}
	
	
}
