package br.com.gecp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gecp.model.Usuario;

@RestController
@RequestMapping("Usuario")
public class UsuarioController {
	
	
	@PostMapping(value = "/cadastro", produces = "application/json")
	public ResponseEntity<String> cadastroUsuario(@RequestBody Usuario cliente){
		
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}

}
