package com.quileia.transito.modelo;

import com.quileia.transito.dto.ViaDto;
import com.quileia.transito.enumerador.TipoPadimento;
import com.quileia.transito.enumerador.TipoVia;
import org.springframework.data.annotation.Id;
import java.util.UUID;

public class Via {
    @Id
    private int identificador;
    private String tipo;
    private String padimento;
    private int numero;
    private Double congestion;


    public Via(ViaDto viaDto){
        String id = UUID.randomUUID().toString();
        int num = id.hashCode();
        identificador = num;
        this.tipo = viaDto.getTipo();
        this.padimento = viaDto.getPadimento();
        this.numero = viaDto.getNumero();
        this.congestion = viaDto.getCongestion();
    }

    public Via(){}

    public int getIdentificador() {
        return identificador;
    }

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

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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
