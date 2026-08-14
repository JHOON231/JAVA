package com.krakedev.copy;

public class TestPlato {

    public static void main(String[] args) {
        Plato platoA = new Plato();
        Plato platoB = new Plato();
        Plato platoC = new Plato();

        System.out.println("====== VALORES POR DEFECTO ======");
        System.out.println("Plato A - Nombre: " + platoA.getNombre() + ", Tipo: " + platoA.getTipo() + ", Precio: " + platoA.getPrecio() + ", Disponible: " + platoA.isDisponible());
        System.out.println("Plato B - Nombre: " + platoB.getNombre() + ", Tipo: " + platoB.getTipo() + ", Precio: " + platoB.getPrecio() + ", Disponible: " + platoB.isDisponible());
        System.out.println("Plato C - Nombre: " + platoC.getNombre() + ", Tipo: " + platoC.getTipo() + ", Precio: " + platoC.getPrecio() + ", Disponible: " + platoC.isDisponible());

        platoA.setNombre("Empanada de Verde");
        platoA.setTipo("Entrada");
        platoA.setPrecio(1.50);
        platoA.setDisponible(true);

        platoB.setNombre("Seco de Chivo");
        platoB.setTipo("Plato fuerte");
        platoB.setPrecio(5.00);
        platoB.setDisponible(true);

        platoC.setNombre("Flan de Leche");
        platoC.setTipo("Postre");
        platoC.setPrecio(2.25);
        platoC.setDisponible(false);

        System.out.println("\n====== VALORES MODIFICADOS ======");
        System.out.println("Plato A - Nombre: " + platoA.getNombre() + ", Tipo: " + platoA.getTipo() + ", Precio: $" + platoA.getPrecio() + ", Disponible: " + platoA.isDisponible());
        System.out.println("Plato B - Nombre: " + platoB.getNombre() + ", Tipo: " + platoB.getTipo() + ", Precio: $" + platoB.getPrecio() + ", Disponible: " + platoB.isDisponible());
        System.out.println("Plato C - Nombre: " + platoC.getNombre() + ", Tipo: " + platoC.getTipo() + ", Precio: $" + platoC.getPrecio() + ", Disponible: " + platoC.isDisponible());
    }
}
