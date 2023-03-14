package com.peliculas.pro.Service;

import java.util.List;

import com.peliculas.pro.Entity.Cliente;

public interface IntClienteService {
	
	public void guardar(Cliente cliente);
	public List<Cliente> obtenerCliente();
	public Cliente buscarPorId(Integer idCliente);
	public void eliminar(Integer idCliente);
	public int numeroCliente();
	
}
