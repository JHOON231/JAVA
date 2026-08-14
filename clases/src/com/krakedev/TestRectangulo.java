package com.krakedev;

public class TestRectangulo {

    public static void main(String[] args) {

       
        Rectangulo r1 = new Rectangulo(10.0, 5.0);
        Rectangulo r2 = new Rectangulo(8.0, 3.0);

        System.out.println("Área r1: " + r1.calcularArea());
        System.out.println("Perímetro r1: " + r1.calcularPerimetro());

        System.out.println("Área r2: " + r2.calcularArea());
        System.out.println("Perímetro r2: " + r2.calcularPerimetro());
    }
}
