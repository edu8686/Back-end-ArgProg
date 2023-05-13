
package com.portfolio.jwt.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "https://portfolio-ap-dfae9.web.app/")
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreExp;
    private String fechaInicial;
    private String fechaFinal;
    private String descripcionExp;
    
    //Constructor

    public Experiencia() {
    }

    public Experiencia(String nombreExp, String fechaInicial, String fechaFinal, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.descripcionExp = descripcionExp;
    }
    
    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
