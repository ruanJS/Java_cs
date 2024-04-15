package br.com.fiap.id.dto;

public class UserDTO {
    private String nome;
    private String email;
    private String cpf;
    private String dtNascimento;
    private String senha;

    public UserDTO() {
    }

    public UserDTO(String nome, String email, String cpf, String dtNascimento, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.senha = senha;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
