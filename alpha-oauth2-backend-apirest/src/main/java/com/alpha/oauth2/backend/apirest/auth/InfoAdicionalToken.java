package com.alpha.oauth2.backend.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.alpha.oauth2.backend.apirest.models.entity.Usuario;
import com.alpha.oauth2.backend.apirest.models.services.IUsuarioService;


//Para usar este componente se debe de registrar en el servidor de autorizacion AuthorizationServerConfig, 
//metodo AuthorizationServerEndpointsConfigurer
@Component
public class InfoAdicionalToken implements TokenEnhancer {
	
	//Con autowired importamos la interfaz de usuarioservice
	@Autowired
	private IUsuarioService usuarioService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		//Invocando por JPA la informacion del usuario
		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		
		//Implementamos un objeto del tipo MAP de java
		//Le asignamos informacion y luego se lo adicionamos al accessToken y lo retornamos
		Map<String, Object> info = new HashMap<>();
		info.put("info_adicional", "Hola que tal !".concat(authentication.getName()));
		
		//Adicionando data obtenida por JPA
		info.put("nombre_usuario: ", usuario.getId() + ": " + usuario.getUsername());
		info.put("nombre: ", usuario.getNombre());
		info.put("apellido: ", usuario.getApellido());
		info.put("email: ", usuario.getEmail());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
		
	}

}
