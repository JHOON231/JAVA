package com.krakedev;

public class TestRectangulo {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.base = 4;
        r1.altura = 2;

        int area1 = r1.calcularArea();
        double perimetro1 = r1.calcularPerimetro();

        System.out.println("Area r1: " + area1);
        System.out.println("Perimetro r1: " + perimetro1);

        Rectangulo r2 = new Rectangulo();
        r2.base = 5;
        r2.altura = 3;

        int area2 = r2.calcularArea();
        double perimetro2 = r2.calcularPerimetro();

        System.out.println("Area r2: " + area2);
        System.out.println("Perimetro r2: " + perimetro2);
    }
}
