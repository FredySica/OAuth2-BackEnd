package com.alpha.oauth2.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.alpha.oauth2.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
