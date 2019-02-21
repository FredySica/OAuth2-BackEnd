/*
 * Implementando el contrato del CRUD en la clase service
 */
package com.alpha.oauth2.backend.apirest.models.services;

import java.util.List;

import com.alpha.oauth2.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

	
}
