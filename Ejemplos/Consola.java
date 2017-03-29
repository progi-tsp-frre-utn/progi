package com.frre.tsp.consola;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by facundo.matoff on 23/03/2017.
 */
public class Consola {

    public static void main(String[] args) {

        // Utiliza clase Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);

        // Lee un valor numerico
        int valor1 = scanner.nextInt();

        // Lee un valor String.
        String valor2 = scanner.next();

        // Lee un valor decimal (previamente se tiene que establecer que el "." es el separador decimal)
        scanner.useLocale(Locale.US);
        float valor3 = scanner.nextFloat();

        // Lee un valor Bulenado
        boolean valor4 = scanner.nextBoolean();
    }
}
