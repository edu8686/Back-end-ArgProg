
package com.portfolio.jwt.Dto;

import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String fechaInicial;
    @NotBlank
    private String fechaFinal;
    @NotBlank
    private String descripcionExp; 
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String fechaInicial, String fechaFinal, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.descripcionExp = descripcionExp;
    }
    
    //Getters & Setters

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
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
    
    

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }
    
}
