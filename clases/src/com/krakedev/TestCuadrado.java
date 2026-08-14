package com.krakedev;

public class TestCuadrado {

    public static void main(String[] args) {


        Cuadrado c1 = new Cuadrado(4.0);
        Cuadrado c2 = new Cuadrado(5.5);

        System.out.println("Área c1: " + c1.calcularArea());
        System.out.println("Perímetro c1: " + c1.calcularPerimetro());

        System.out.println("Área c2: " + c2.calcularArea());
        System.out.println("Perímetro c2: " + c2.calcularPerimetro());
    }
}
