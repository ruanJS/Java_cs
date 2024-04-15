package br.com.fiap.id.dto;

public class CourseDTO {
    private String nome;
    private String descrição;
    private String categoria;
    private int duraçãoHoras;

    public CourseDTO() {
    }

    public CourseDTO(String nome, String descrição, String categoria, int duraçãoHoras) {
        this.nome = nome;
        this.descrição = descrição;
        this.categoria = categoria;
        this.duraçãoHoras = duraçãoHoras;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuraçãoHoras() {
        return duraçãoHoras;
    }

    public void setDuraçãoHoras(int duraçãoHoras) {
        this.duraçãoHoras = duraçãoHoras;
    }
}
