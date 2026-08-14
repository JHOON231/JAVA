package com.krakedev.copy;

public class VehiculoTest {

    public static void main(String[] args) {

        Vehiculo v;
        v = new Vehiculo();
        
        System.out.println("========================Vehiculo 1 : Creado========================");
        
        System.out.println("Año: " + v.getAño());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());
        
        System.out.println("==================Vehiculo 1 : Valores asignados==================");
        v.setAño("2012");
        v.setMarca("chevrolet");
        v.setModelo("nuevo");
        
        System.out.println("Año: " + v.getAño());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());
        
        System.out.println("========================Vehiculo 2 : Creado========================");
        
        Vehiculo v2 = new Vehiculo();
        System.out.println("Año: " + v2.getAño());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());
        
        System.out.println("==================Vehiculo 2 : Valores asignados==================");
        v2.setAño("2026");
        v2.setMarca("chevrolet");
        v2.setModelo("El mas rapido");
        
        System.out.println("Año: " + v2.getAño());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());
    }

}
