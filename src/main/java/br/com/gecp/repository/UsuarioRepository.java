package br.com.gecp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gecp.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

}
