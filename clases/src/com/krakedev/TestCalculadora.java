package com.krakedev;

public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();

        int resultadoSuma = calcu.sumar(5, 3);
        int resultadoResta = calcu.restar(10, 4);
        double resultadoMultiplicar = calcu.multiplicar(10, 5);
        double resultadoDividir = calcu.dividir(10, 2);
        double resultadoPromediar = calcu.promediar(10, 8, 9);

        System.out.println("RESULTADO SUMA: " + resultadoSuma);
        System.out.println("RESULTADO RESTA: " + resultadoResta);
        System.out.println("RESULTADO MULTIPLICAR: " + resultadoMultiplicar);
        System.out.println("RESULTADO DIVIDIR: " + resultadoDividir);
        System.out.println("RESULTADO PROMEDIO: " + resultadoPromediar);

        calcu.mostrarResultado();
    }
}
