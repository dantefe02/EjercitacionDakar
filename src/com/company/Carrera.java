package com.company;

import java.util.List;

public class Carrera {

    //Atributos


    List<Vehiculo> listaDeVehiculos;
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;

    //Constructor

    public Carrera(Double distancia, Double premioEnDolares, String nombre,
                   Integer cantidadDeVehiculosPermitidos, List<Vehiculo> listaDeVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = listaDeVehiculos;
    }
}
