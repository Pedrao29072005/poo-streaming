package br.com.streaming.financeiro;

import br.com.streaming.model.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Assinatura {
    private LocalDate dataInicio;
    private BigDecimal valor;
    private CartaodeCredito cartao;
    private Usuario usuario;

    public Assinatura(LocalDate dataInicio, BigDecimal valor) {
        this.dataInicio = dataInicio;
        this.valor = valor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public CartaodeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaodeCredito cartao) {
        this.cartao = cartao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assinatura that = (Assinatura) o;
        return Objects.equals(dataInicio, that.dataInicio) && Objects.equals(valor, that.valor) && Objects.equals(cartao, that.cartao) && Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, valor, cartao, usuario);
    }

    @Override
    public String toString() {
        return "Assinatura{" +
                "dataInicio=" + dataInicio +
                ", valor=" + valor +
                ", cartao=" + cartao +
                ", usuario=" + usuario +
                '}';
    }

}
