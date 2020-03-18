package com.company;

public abstract class Vehiculo {


    //Atributos del Vehiculo


    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Integer peso;
    private Integer ruedas;

    //constructor

    public Vehiculo(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente, Integer peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }
}
