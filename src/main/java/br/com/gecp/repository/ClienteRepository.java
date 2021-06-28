package br.com.gecp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gecp.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{

}
