package com.cliente.service;

import com.cliente.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface IClienteService {

	public List<Cliente> listarClientes();
	public Optional<Cliente> getClienteById(Long id);
	public Cliente saveCliente(Cliente cliente);
	public void deleteCliente(Long id);
	
}