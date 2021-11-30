package com.example.pruebadeexamen1t3.entities;

import android.os.Parcelable;

public class Persona {
    private String nombre;
    private String numero;

    public Persona(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;

    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
