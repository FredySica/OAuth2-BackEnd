package com.alpha.oauth2.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role implements Serializable {

	//Generacion de entidad Role
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre", unique=true, length=20)
	private String nombre;
	private static final long serialVersionUID = 1L;
	

	//Generacion de relacion de clases USUARIO y ROLE Bidireccional
	@ManyToMany(mappedBy="roles")
	private List<Usuario> usuarios;
	
	
	//Getters and Setters	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
