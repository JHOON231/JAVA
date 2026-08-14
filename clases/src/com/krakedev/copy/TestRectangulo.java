package com.krakedev.copy;

public class TestRectangulo {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("--- Valores iniciales (por defecto) ---");
        System.out.println("Base r1 inicial: " + r1.getBase());
        System.out.println("Altura r1 inicial: " + r1.getAltura());

        r1.setBase(4);
        r1.setAltura(2);

        int area1 = r1.calcularArea();
        double perimetro1 = r1.calcularPerimetro();

        System.out.println("\n--- Valores modificados r1 ---");
        System.out.println("Base r1: " + r1.getBase() + " | Altura r1: " + r1.getAltura());
        System.out.println("Area r1: " + area1);
        System.out.println("Perimetro r1: " + perimetro1);

        Rectangulo r2 = new Rectangulo();
        r2.setBase(5);
        r2.setAltura(3);

        int area2 = r2.calcularArea();
        double perimetro2 = r2.calcularPerimetro();

        System.out.println("\n--- Valores modificados r2 ---");
        System.out.println("Base r2: " + r2.getBase() + " | Altura r2: " + r2.getAltura());
        System.out.println("Area r2: " + area2);
        System.out.println("Perimetro r2: " + perimetro2);
    }
}
