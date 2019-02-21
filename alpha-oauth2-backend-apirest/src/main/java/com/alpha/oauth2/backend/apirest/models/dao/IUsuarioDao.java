package com.alpha.oauth2.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.alpha.oauth2.backend.apirest.models.entity.Usuario;


/*
 * El Crud basado en JPA solicita lo siguiente:
 * Usuario: Entity para implementar la consulta u operaciones
 * Long: Id para identificar la data
 */
public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	//Implementando metodo personalizado con JPA Repository
	//Este metodo implica: find = Buscar, By = where, Username = 'parametro'
	//Implicito es: "select u from Usuario u where u.username = ?1"
	public Usuario findByUsername(String username);
	
	//Utilizacion de la notacion Query, en este caso no importa el nombre del metodo porque su funcion se basara en la notacion
	@Query("select u from Usuario u where u.username = ?1")
	public Usuario findByUsername2(String username);
	
}
