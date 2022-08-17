package com.bantads.gerente.bantadsgerente.model;

import java.io.Serializable;

public class Gerente implements Serializable {
    private int id;
    private int idExternoUsuario;
    private String nome;
    private String cpf;

    public Gerente() {
        super();
    }

    public Gerente(int id, int idExternoUsuario, String nome, String cpf) {
        this.id = id;
        this.idExternoUsuario = idExternoUsuario;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdExternoUsuario() {
        return idExternoUsuario;
    }

    public void setIdExternoUsuario(int idExternoUsuario) {
        this.idExternoUsuario = idExternoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
