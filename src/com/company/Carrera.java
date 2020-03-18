package com.company;

import java.util.List;
import java.util.Set;

public class Carrera {


    //Atributos


    Set<Vehiculo> conjuntoDeVehiculos;
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;

    //Constructor

    public Carrera(Double distancia, Double premioEnDolares, String nombre,
                   Integer cantidadDeVehiculosPermitidos, List<Vehiculo> listaDeVehiculos, Set<Vehiculo> conjuntoDeVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.conjuntoDeVehiculos = conjuntoDeVehiculos;
    }

    //metodo para agregar autos

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        Auto unAuto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (cantidadDeVehiculosPermitidos > conjuntoDeVehiculos.size()) {
            conjuntoDeVehiculos.add(unAuto);
        } else {
            System.out.println("La carrera esta llena, no hay lugar para mas vehiculos");
        }
    }

    //metodo para agregar motos

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        Moto unaMoto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        if (cantidadDeVehiculosPermitidos > conjuntoDeVehiculos.size()) {
            conjuntoDeVehiculos.add(unaMoto);
        } else {
            System.out.println("La carrera esta llena, no hay lugar para mas vehiculos");
        }
    }

}
