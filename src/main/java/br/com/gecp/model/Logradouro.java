package br.com.gecp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Logradouro {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;



}