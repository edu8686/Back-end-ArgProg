
package com.portfolio.jwt.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String descripcionEd;
    @NotBlank
    private String imgEd;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEd, String descripcionEd, String imgEd) {
        this.nombreEd = nombreEd;
        this.descripcionEd = descripcionEd;
        this.imgEd = imgEd;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
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
