package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estado;
    private String nombre;
    private String moneda;
    private int tamano;
    private String capital;
    private int poblacion;

    public Estado() {
    }
    //Constructor de Estado.
    public Estado(String nombre, String moneda, int tamano, String capital, int poblacion) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.tamano = tamano;
        this.capital = capital;
        this.poblacion = poblacion;
    }
    

}
