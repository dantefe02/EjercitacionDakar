package com.company;

public class Auto extends Vehiculo {

    //Constructor

    public Auto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000, 4);
    }
}
