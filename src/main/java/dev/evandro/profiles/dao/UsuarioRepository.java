package dev.evandro.profiles.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.evandro.profiles.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
