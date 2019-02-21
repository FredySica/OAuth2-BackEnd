package com.alpha.oauth2.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.alpha.oauth2.backend.apirest.models.entity.Moneda;

//CrudRepository<Clase, ID>
public interface IMonedaDao extends CrudRepository<Moneda, Long> {

}
