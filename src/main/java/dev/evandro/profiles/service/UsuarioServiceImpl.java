package dev.evandro.profiles.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.evandro.profiles.dao.UsuarioRepository;
import dev.evandro.profiles.dto.UsuarioRequestDTO;
import jakarta.validation.Valid;


@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Integer cadastrarUsuario(@Valid UsuarioRequestDTO novo) {
		// TODO Auto-generated method stub
		/*Usuario usuario = new Usuario();
		
		usuario = repository.save(novo.toUsuario());*/
		/*if(novo.nome() == null || novo.nome().isBlank() || novo.email() == null || novo.email().isBlank() || 
				novo.senha() == null || novo.senha().length() < 5) {
			throw new IllegalArgumentException("Todos os dados são Obrigatórios");
		}*/
		
		if(Objects.nonNull(repository.save(novo.toUsuario()))) {
			return 1;
		}
		
		return null;
	}
}
