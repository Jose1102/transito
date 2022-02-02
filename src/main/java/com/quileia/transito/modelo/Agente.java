package com.quileia.transito.modelo;

import com.quileia.transito.dto.AgenteDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Agente {
    @Id
    private String codigo;
    private String nombre;
    private Double añosExperiencia;
    private String codigoSecretaria;
    private int viaActual;


    public Agente(){}

    public Agente(AgenteDto agenteDto){
        this.nombre = agenteDto.getNombre();
        this.codigo = agenteDto.getCodigo();
        this.añosExperiencia = agenteDto.getAñosExperiencia();
        this.codigoSecretaria = agenteDto.getCodigoSecretaria();
        this.viaActual = agenteDto.getViaActual();

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getCodigoSecretaria() {
        return codigoSecretaria;
    }

    public int getViaActual() {
        return viaActual;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAñosExperiencia(Double añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setCodigoSecretaria(String codigoSecretaria) {
        this.codigoSecretaria = codigoSecretaria;
    }

    public void setViaActual(int viaActual) {
        this.viaActual = viaActual;
    }
}
