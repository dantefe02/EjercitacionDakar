package com.company;

public class Moto extends Vehiculo {

    //Constructor

    public Moto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente, Integer peso, Integer ruedas) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 300, 2);
    }
}
