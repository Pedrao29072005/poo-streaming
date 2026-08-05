package br.com.streaming.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Usuario {
    public static final String NOME_PLATAFORMA = "StreamX";
    private static int contadorUsuarios = 0;

    private String email;
    private String nome;
    private boolean ativo;
    private List<Video> historicoAssistidos;

    public Usuario() {
        this("", "");
    }

    public Usuario(String email, String nome) {
        this.email = email;
        this.nome = nome;
        this.ativo = true;
        this.historicoAssistidos = new ArrayList<>();
        contadorUsuarios++;
    }

    public void assistirVideo(Video v) {
        if (v != null) {
            historicoAssistidos.add(v);
        }
    }

    public List<Video> getHistoricoAssistidos() {
        return Collections.unmodifiableList(historicoAssistidos);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email) && Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, nome);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", ativo=" + ativo +
                '}';
    }

}
