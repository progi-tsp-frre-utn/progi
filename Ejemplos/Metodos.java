package com.frre.tsp.metodos;

import java.util.Scanner;

/**
 * Ejemplo de uso de Metodos
 */
public class Metodos {
    
    // Declaro variables globales a todos los metodos.
    static int valor1;
    static int valor2;
    static int resultado;
    
    public static void main(String[] args) {

        // Algoritmo con métodos
        leerValoresDelTeclado();
        imprimirResultado(resultado);
        
    }

    public static void leerValoresDelTeclado() {
        // Leer 2 valores enteros del teclado.
        Scanner s = new Scanner(System.in);

        imprimirMensaje("Ingrese el Valor 1:");
        valor1 = s.nextInt();

        imprimirMensaje("Ingrese el Valor 2:");
        valor2 = s.nextInt();
    }

    public static void imprimirMensaje(String m) {
        System.out.println(m);
    }

    public static void imprimirResultado(int r) {
        System.out.println("El resultado es: " + r);
    }
}
