package br.com.streaming.model;

import java.util.Objects;

public class Categoria {
    private String nome;
    private int classificacaoIdade;
    public Categoria(String nome, int classificacaoIdade) {
        this.nome = nome;
        this.classificacaoIdade = classificacaoIdade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getClassificacaoIdade() {
        return classificacaoIdade;
    }
    public void setClassificacaoIdade(int classificacaoIdade) {
        this.classificacaoIdade = classificacaoIdade;
    }
    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", classificacaoIdade=" + classificacaoIdade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return classificacaoIdade == categoria.classificacaoIdade && Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, classificacaoIdade);
    }
}