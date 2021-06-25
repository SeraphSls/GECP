package br.com.gecp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cliente {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;

    private Date dataCadastro;

    @ManyToOne(targetEntity = Telefone.class)
    private Telefone telefone;

    @ManyToOne(targetEntity=Email.class)
    private Email email;


    @ManyToOne(targetEntity=Endereco.class)
    private Endereco endereco;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
