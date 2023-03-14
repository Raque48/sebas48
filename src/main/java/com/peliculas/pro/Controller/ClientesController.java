package com.peliculas.pro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.peliculas.pro.Entity.Cliente;
import com.peliculas.pro.Service.IntClienteService;

@Controller
@RequestMapping("/clientes")
public class ClientesController{
	
	@Autowired
	private IntClienteService serviceCliente;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Cliente> clientes = serviceCliente.obtenerCliente();
		model.addAttribute("clientes", clientes);
		model.addAttribute("total", serviceCliente.numeroCliente());
		return "clientes/listaClientes";
	}
	
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("id") int idCliente, RedirectAttributes model ) {
		model.addFlashAttribute("msg", "Usuario eliminado");
		serviceCliente.eliminar(idCliente);
		return "redirect:/clientes/index";
	}

}
