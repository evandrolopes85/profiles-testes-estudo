package dev.evandro.profiles.dto;

import dev.evandro.profiles.model.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioRequestDTO(@NotNull @NotBlank String nome, 
								@Email @NotNull String email, 
								@Size(min=4, max=16) String senha) {

	public Usuario toUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		return usuario;
	}
}
