package com.quileia.transito.dto;

import com.quileia.transito.enumerador.TipoPadimento;
import com.quileia.transito.enumerador.TipoVia;

public class ViaDto {


    private String tipo;
    private String padimento;
    private int numero;
    private Double congestion;

    public String getTipo() {
        return tipo;
    }

    public String getPadimento() {
        return padimento;
    }

    public int getNumero() {
        return numero;
    }

    public Double getCongestion() {
        return congestion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPadimento(String padimento) {
        this.padimento = padimento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCongestion(Double congestion) {
        this.congestion = congestion;
    }
}
