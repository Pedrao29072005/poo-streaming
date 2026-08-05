package br.com.streaming.financeiro;

import java.math.BigDecimal;
import java.util.Objects;

public class CartaodeCredito {
    private String numero;
    private BigDecimal limite;

    public CartaodeCredito(String numero, BigDecimal limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "CartaodeCredito{" +
                "numero='" + numero + '\'' +
                ", limite=" + limite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartaodeCredito that = (CartaodeCredito) o;
        return Objects.equals(numero, that.numero) && Objects.equals(limite, that.limite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, limite);
    }
}
