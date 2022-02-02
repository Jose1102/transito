package com.quileia.transito.dto;

public class AgenteDto {

    private String nombre;
    private String codigo;
    private Double añosExperiencia;
    private String codigoSecretaria;
    private int viaActual;

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
