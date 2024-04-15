package br.com.fiap.id.dto;

public class InterestDTO {
    private String nome;
    private String descricao;

    public InterestDTO() {
    }

    public InterestDTO(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
