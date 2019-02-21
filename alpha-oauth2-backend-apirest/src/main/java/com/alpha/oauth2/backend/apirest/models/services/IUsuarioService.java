package com.alpha.oauth2.backend.apirest.models.services;

import com.alpha.oauth2.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
