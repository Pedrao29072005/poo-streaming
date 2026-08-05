package br.com.streaming.model;

import java.util.Objects;

public class Video {
    private String titulo;
    private int duracaoEmMinutos;

    // Associação 1:1 - atributo do tipo Categoria
    private Categoria categoria;

    public Video(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return duracaoEmMinutos == video.duracaoEmMinutos && Objects.equals(titulo, video.titulo) && Objects.equals(categoria, video.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duracaoEmMinutos, categoria);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", categoria=" + categoria +
                '}';
    }

}
