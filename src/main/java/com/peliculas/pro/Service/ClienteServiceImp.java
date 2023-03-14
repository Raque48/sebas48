package com.peliculas.pro.Service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.peliculas.pro.Entity.Cliente;

@Service
public class ClienteServiceImp implements IntClienteService{
	
	private List<Cliente> clientes;
	
	public ClienteServiceImp(){
		
		clientes = new LinkedList<>();
		
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNombre("Sebastian");
		c1.setApellidos("Santiago Perez");
		c1.setEdad(20);
		c1.setCorreo("sspsantiago15@gmail.com");
		c1.setContrasena("sebitas21");
		
		Cliente c2 = new Cliente();
		c2.setId(2);
		c2.setNombre("Christian Jovani");
		c2.setApellidos("Carmona Hernandez");
		c2.setEdad(20);
		c2.setCorreo("chrisSpider@gmail.com");
		c2.setContrasena("Spider21");
		
		Cliente c3 = new Cliente();
		c3.setId(3);
		c3.setNombre("Sebastian Jovany");
		c3.setApellidos("Santiago Carmona");
		c3.setEdad(30);
		c3.setCorreo("cliente30@gmail.com");
		c3.setContrasena("cliente21");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
	}
	
	@Override
	public Cliente buscarPorId(Integer idCliente) {
		for(Cliente c: clientes) {
			if(c.getId().compareTo(idCliente)==0) {
				return c;
			}
		}
		return null;
	}
	
	@Override
	public void eliminar(Integer idCliente) {
		clientes.remove(buscarPorId(idCliente));
		
	}
	
	@Override
	public void guardar(Cliente cliente) {
		clientes.add(cliente);
		
	}
	
	@Override
	public int numeroCliente() {
		return clientes.size();
	}
	
	@Override
	public List<Cliente> obtenerCliente() {
		return clientes;
	}


}
