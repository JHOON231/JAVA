package com.krakedev.copy;

public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();

        int resultadoSuma = calcu.sumar(5, 3);
        double resultadoResta = calcu.restar(10, 4);
        double resultadoMultiplicar = calcu.multiplicar(10, 5);
        double resultadoDividir = calcu.dividir(10, 2);
        double resultadoPromediar = calcu.promediar(10, 8, 9);
         //double presiosSinDescuento = calcu.presio1(15);

        System.out.println("RESULTADO SUMA: " + resultadoSuma);
        System.out.println("RESULTADO RESTA: " + resultadoResta);
        System.out.println("RESULTADO MULTIPLICAR: " + resultadoMultiplicar);
        System.out.println("RESULTADO DIVIDIR: " + resultadoDividir);
        System.out.println("RESULTADO PROMEDIO: " + resultadoPromediar);

        calcu.mostrarResultado();
        Calculadora calcu2 = new Calculadora();
        double resultadoResta2 = calcu2.restar(100.5, 40.5); 
        System.out.println("RESULTADO RESTA2: " + resultadoResta2);
        
        double presioConDescuento = calcu2.calcularDescuento(200.0, 15.0);
        System.out.println("RESULTADO DESCUENTO: " + presioConDescuento);
        
        
        
        
    }
}
