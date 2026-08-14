package com.krakedev;

public class VehiculoTest {

    public static void main(String[] args) {

      
        Vehiculo v1 = new Vehiculo("Chevrolet", "Sail", "2012");
        Vehiculo v2 = new Vehiculo("Chevrolet", "Spark", "2026");
        Vehiculo v3 = new Vehiculo("Toyota", "Corolla", "2020");

        System.out.println("========================Vehiculo 1========================");
        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Año: " + v1.getAnio());

        System.out.println("========================Vehiculo 2========================");
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());
        System.out.println("Año: " + v2.getAnio());

        System.out.println("========================Vehiculo 3========================");
        System.out.println("Marca: " + v3.getMarca());
        System.out.println("Modelo: " + v3.getModelo());
        System.out.println("Año: " + v3.getAnio());
    }
}
