package com.krakedev;

public class TestRestaurante {

    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

        System.out.println("====== VALORES POR DEFECTO ======");
        System.out.println("Restaurante 1 - Nombre: " + rest1.nombre);
        System.out.println("Restaurante 1 - Dirección: " + rest1.direccion);
        System.out.println("Restaurante 1 - Calificación: " + rest1.calificacion);

        System.out.println("---------------------------------");
        System.out.println("Restaurante 2 - Nombre: " + rest2.nombre);
        System.out.println("Restaurante 2 - Dirección: " + rest2.direccion);
        System.out.println("Restaurante 2 - Calificación: " + rest2.calificacion);

        rest1.nombre = "La Sazón de Mamá";
        rest1.direccion = "Av. Principal 123";
        rest1.calificacion = 4.8;

        rest2.nombre = "El Rincón Criollo";
        rest2.direccion = "Calle Secundaria 456";
        rest2.calificacion = 4.2;

        System.out.println("\n====== VALORES MODIFICADOS ======");
        System.out.println("Restaurante 1 - Nombre: " + rest1.nombre);
        System.out.println("Restaurante 1 - Dirección: " + rest1.direccion);
        System.out.println("Restaurante 1 - Calificación: " + rest1.calificacion);

        System.out.println("---------------------------------");
        System.out.println("Restaurante 2 - Nombre: " + rest2.nombre);
        System.out.println("Restaurante 2 - Dirección: " + rest2.direccion);
        System.out.println("Restaurante 2 - Calificación: " + rest2.calificacion);
    }
}
