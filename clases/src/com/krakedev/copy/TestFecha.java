package com.krakedev.copy;

public class TestFecha {

	public static void main(String[] args) {
		
		
		Fecha f1 = new Fecha();
		f1.setAnio(2026);
		f1.setMes(4);
		f1.setDia(1);
		f1.setHora(3);
		
		
		System.out.println("año: " + f1.getAnio());
		System.out.println("mes: " + f1.getMes());
		System.out.println("dia: " + f1.getDia());
		System.out.println("hora:" + f1.getHora());

	}

}
