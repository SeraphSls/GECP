package br.com.gecp.entity;

import javax.persistence.*;

import java.util.Date;

@Entity
public class ClienteEntity {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;

    private Date dataCadastro;

    @ManyToOne(targetEntity = TelefoneEntity.class)
    private TelefoneEntity telefone;

    @ManyToOne(targetEntity=EmailEntity.class)
    private EmailEntity email;


    @ManyToOne(targetEntity=EnderecoEntity.class)
    private EnderecoEntity endereco;


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

    public TelefoneEntity getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneEntity telefone) {
        this.telefone = telefone;
    }
}
