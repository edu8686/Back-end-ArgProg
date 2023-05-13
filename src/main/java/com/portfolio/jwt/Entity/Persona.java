
package com.portfolio.jwt.Entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "https://portfolio-ap-dfae9.firebaseapp.com/")
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    @NotNull
    @Size(min = 1, max = 50, message = "Espacio excedido")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "Espacio excedido")
    private String apellido;
    @NotNull
    private String descripcion;
    @NotNull
    private String img;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
