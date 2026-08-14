package com.krakedev.copy;

public class Calculadora {
	
	public double calcularDescuento(double presio1, double descuento) {
		double resultado = presio1 - (presio1 * descuento / 100); 
		return resultado;
	}

    public int sumar(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public double restar(double a, double b) {
        double resultado;
        resultado = a - b;
        return resultado;
    }

    public double multiplicar(double valor1, double valor2) {
        double producto;
        producto = valor1 * valor2;
        return producto;
    }

    public double dividir(double dividendo, double divisor) {
        double cociente;
        cociente = dividendo / divisor;
        return cociente;
    }

    public double promediar(double valor1, double valor2, double valor3) {
        double promedio;
        promedio = (valor1 + valor2 + valor3) / 3;
        return promedio;
    }

    public void mostrarResultado() {
        System.out.println("No molestes, Sali al almuerzo. Regreso en 15 minutos");
    }
}