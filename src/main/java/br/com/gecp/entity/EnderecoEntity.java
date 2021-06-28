package br.com.gecp.entity;

import javax.persistence.*;

@Entity
public class EnderecoEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Integer numero;

    private String complemento;

    private String observacao;

    @ManyToOne(targetEntity = LogradouroEntity.class)   
    private LogradouroEntity logradouro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public LogradouroEntity getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(LogradouroEntity logradouro) {
		this.logradouro = logradouro;
	}
    
    


}
