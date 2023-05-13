
package com.portfolio.jwt.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String fechaInicial;
    @NotBlank
    private String fechaFinal;
    @NotBlank
    private String descripcionEd;
    @NotBlank
    private String imgEd;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEd, String fechaInicial, String fechaFinal, String descripcionEd, String imgEd) {
        this.nombreEd = nombreEd;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.descripcionEd = descripcionEd;
        this.imgEd = imgEd;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }

    public String getImgEd() {
        return imgEd;
    }

    public void setImgEd(String imgEd) {
        this.imgEd = imgEd;
    }
    
    
}
