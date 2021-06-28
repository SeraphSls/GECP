package br.com.gecp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gecp.model.ManterClienteModel;

@Controller
@RequestMapping("/cliente")
public class ManterClienteController {
	
	@Autowired
	private ManterClienteModel manterCliente;
	
	@GetMapping
	public void todosClientes() {
		this.manterCliente.todos();
		
	}
	

}
