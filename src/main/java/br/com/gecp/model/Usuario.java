package br.com.gecp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id 
	private Long id;
	
	private String nomeCompleto;
	
	private String userName;
	
	private String email;
	
	private String senha;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
	



	

}
