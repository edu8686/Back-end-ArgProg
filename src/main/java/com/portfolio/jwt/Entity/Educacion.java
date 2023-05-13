
package com.portfolio.jwt.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "https://portfolio-ap-dfae9.web.app")
@Entity 
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEd;
    private String fechaInicial;
    private String fechaFinal;
    private String descripcionEd;
    private String imgEd;

    public Educacion() {
    }

    public Educacion(String nombreEd, String fechaInicial, String fechaFinal, String descripcionEd, String imgEd) {
        this.nombreEd = nombreEd;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.descripcionEd = descripcionEd;
        this.imgEd = imgEd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
