package com.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cliente.model.Cliente;
import com.cliente.service.IClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	// LISTAR TODOS GET http://localhost:7575/api/clientes
	@GetMapping
	public ResponseEntity<List<Cliente>> listarClientes() {
		return ResponseEntity.ok(clienteService.listarClientes());
	}

	// BUSCAR POR ID GET http://localhost:7575/api/clientes/1
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
		return clienteService.getClienteById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	// GUARDAR POST http://localhost:7575/api/clientes
	@PostMapping
	public ResponseEntity<Cliente> saveCliente(@Valid @RequestBody Cliente cliente) {
		Cliente nuevo = clienteService.saveCliente(cliente);
		return ResponseEntity.status(201).body(nuevo);
	}

	// ELIMINAR DELETE http://localhost:7575/api/clientes/1
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
		if (!clienteService.getClienteById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		clienteService.deleteCliente(id);
		return ResponseEntity.noContent().build();
	}
}