package com.peliculas.pro.Controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.peliculas.pro.Entity.Pelicula;
import com.peliculas.pro.Service.IntPeliculaService;
import com.peliculas.pro.util.Utileria;

@Controller
@RequestMapping("/peliculas")
public class PeliculasController {
	
	@Autowired
	private IntPeliculaService servicePelicula;
	
	@GetMapping("/index")
	public String index(Model model){
		List<Pelicula> peliculas = servicePelicula.obtenerPelicula();
		model.addAttribute("peliculas", peliculas);
		model.addAttribute("total", servicePelicula.numeroPeli());
		return "peliculas/listaPeliculas";
	}
	
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("id") int idPelicula, RedirectAttributes model ) {
		model.addFlashAttribute("msg", "Pelicula eliminada");
		servicePelicula.eliminar(idPelicula);
		return "redirect:/peliculas/index";
	}
	
	@GetMapping("/nueva")
	public String nueva(Pelicula pelicula) {
		return "peliculas/formPeliculas";
	}
	
	@PostMapping("/guardar")
	public String guarda(Pelicula pelicula) {
		servicePelicula.guardar(pelicula);
		return "redirect:/peliculas/index";
	}
	
	@GetMapping("/modificar")
	public String modificar(@RequestParam("id") int idPelicula, Model model) {
		Pelicula pelicula = servicePelicula.buscarPorId(idPelicula);
		model.addAttribute("pelicula", pelicula);
		return "peliculas/formPeliculas";
	}
	
	@GetMapping("/vista")
	public String vista(@RequestParam("id") int idPelicula, Model model) {
		model.addAttribute("pelicula", servicePelicula.buscarPorId(idPelicula));
		return "peliculas/vista";
	}
	
	@GetMapping("/retorno")
	public String retornar() {
		return "redirect:/peliculas/index";
	}
  
}
