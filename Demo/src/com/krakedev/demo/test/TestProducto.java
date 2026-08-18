package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto Producto1 = new Producto(101, "Teclado mecanico");
        Producto1.setDescripcion("Teclado rgb con switches azules");
        Producto1.setPeso(0.85);

        System.out.println("Código: " + Producto1.getCodigo());
        System.out.println("Nombre: " + Producto1.getNombre());
        System.out.println("Descripción: " + Producto1.getDescripcion());
        System.out.println("Peso: " + Producto1.getPeso() + " kg");
    }
}
