package br.edu.fasam.telapessoa.model;


public class Pessoa {

    public Pessoa(String caracteristicas, String descricao) {
        this.caracteristicas = caracteristicas;
        this.descricao = descricao;
    }

    String caracteristicas;
    String descricao;




    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
