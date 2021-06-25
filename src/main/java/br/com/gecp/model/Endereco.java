package br.com.gecp.model;

import javax.persistence.*;

@Entity
public class Endereco {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Integer numero;

    private String complemento;

    private String observacao;

    @ManyToOne(targetEntity = Logradouro.class)   
    private Logradouro logradouro;


}
