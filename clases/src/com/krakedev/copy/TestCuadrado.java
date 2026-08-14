package com.krakedev.copy;

public class TestCuadrado {

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado();
        Cuadrado c3 = new Cuadrado();

        System.out.println("--- Valores iniciales (por defecto) ---");
        System.out.println("Lado c1 por defecto: " + c1.getLado());

        c1.setLado(4);
        c2.setLado(3);
        c3.setLado(5);

        double area1 = c1.calcularAreaCuadrado();
        double perimetro1 = c1.calcularPerimetroCuadrado();

        double area2 = c2.calcularAreaCuadrado();
        double perimetro2 = c2.calcularPerimetroCuadrado();

        double area3 = c3.calcularAreaCuadrado();
        double perimetro3 = c3.calcularPerimetroCuadrado();

        System.out.println("\n--- Valores modificados y resultados ---");
        System.out.println("Cuadrado 1 - Lado: " + c1.getLado() + " | Area: " + area1 + " | Perimetro: " + perimetro1);
        System.out.println("Cuadrado 2 - Lado: " + c2.getLado() + " | Area: " + area2 + " | Perimetro: " + perimetro2);
        System.out.println("Cuadrado 3 - Lado: " + c3.getLado() + " | Area: " + area3 + " | Perimetro: " + perimetro3);
    }
}
