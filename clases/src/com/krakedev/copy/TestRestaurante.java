package com.krakedev.copy;

public class TestRestaurante {

    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

        System.out.println("====== VALORES POR DEFECTO ======");
        System.out.println("Restaurante 1 - Nombre: " + rest1.getNombre());
        System.out.println("Restaurante 1 - Dirección: " + rest1.getDireccion());
        System.out.println("Restaurante 1 - Calificación: " + rest1.getCalificacion());

        System.out.println("---------------------------------");
        System.out.println("Restaurante 2 - Nombre: " + rest2.getNombre());
        System.out.println("Restaurante 2 - Dirección: " + rest2.getDireccion());
        System.out.println("Restaurante 2 - Calificación: " + rest2.getCalificacion());

        rest1.setNombre("La Sazón de Mamá");
        rest1.setDireccion("Av. Principal 123");
        rest1.setCalificacion(4.8);

        rest2.setNombre("El Rincón Criollo");
        rest2.setDireccion("Calle Secundaria 456");
        rest2.setCalificacion(4.2);

        System.out.println("\n====== VALORES MODIFICADOS ======");
        System.out.println("Restaurante 1 - Nombre: " + rest1.getNombre());
        System.out.println("Restaurante 1 - Dirección: " + rest1.getDireccion());
        System.out.println("Restaurante 1 - Calificación: " + rest1.getCalificacion());

        System.out.println("---------------------------------");
        System.out.println("Restaurante 2 - Nombre: " + rest2.getNombre());
        System.out.println("Restaurante 2 - Dirección: " + rest2.getDireccion());
        System.out.println("Restaurante 2 - Calificación: " + rest2.getCalificacion());
    }
}
