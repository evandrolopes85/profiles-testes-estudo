package dev.evandro.profiles.service;

import dev.evandro.profiles.dto.UsuarioRequestDTO;

public interface IUsuarioService {

	public Integer cadastrarUsuario(UsuarioRequestDTO novo);

}
