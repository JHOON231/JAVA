package com.krakedev;

public class TestPlato {

    public static void main(String[] args) {
        Plato platoA = new Plato();
        Plato platoB = new Plato();
        Plato platoC = new Plato();

        System.out.println("====== VALORES POR DEFECTO ======");
        System.out.println("Plato A - Nombre: " + platoA.nombre + ", Tipo: " + platoA.tipo + ", Precio: " + platoA.precio + ", Disponible: " + platoA.disponible);
        System.out.println("Plato B - Nombre: " + platoB.nombre + ", Tipo: " + platoB.tipo + ", Precio: " + platoB.precio + ", Disponible: " + platoB.disponible);
        System.out.println("Plato C - Nombre: " + platoC.nombre + ", Tipo: " + platoC.tipo + ", Precio: " + platoC.precio + ", Disponible: " + platoC.disponible);

        platoA.nombre = "Empanada de Verde";
        platoA.tipo = "Entrada";
        platoA.precio = 1.50;
        platoA.disponible = true;

        platoB.nombre = "Seco de Chivo";
        platoB.tipo = "Plato fuerte";
        platoB.precio = 5.00;
        platoB.disponible = true;

        platoC.nombre = "Flan de Leche";
        platoC.tipo = "Postre";
        platoC.precio = 2.25;
        platoC.disponible = false;

        System.out.println("\n====== VALORES MODIFICADOS ======");
        System.out.println("Plato A - Nombre: " + platoA.nombre + ", Tipo: " + platoA.tipo + ", Precio: $" + platoA.precio + ", Disponible: " + platoA.disponible);
        System.out.println("Plato B - Nombre: " + platoB.nombre + ", Tipo: " + platoB.tipo + ", Precio: $" + platoB.precio + ", Disponible: " + platoB.disponible);
        System.out.println("Plato C - Nombre: " + platoC.nombre + ", Tipo: " + platoC.tipo + ", Precio: $" + platoC.precio + ", Disponible: " + platoC.disponible);
    }
}
