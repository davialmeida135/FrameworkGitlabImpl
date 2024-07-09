package com.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projectmanager.entities.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
