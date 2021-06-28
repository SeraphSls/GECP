package br.com.gecp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gecp.entity.ClienteEntity;
import br.com.gecp.repository.ClienteRepository;

public class ManterClienteModel {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<ClienteEntity> todos() {
		return clienteRepository.findAll();
	}

}
