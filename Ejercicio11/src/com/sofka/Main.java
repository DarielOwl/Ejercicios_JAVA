package com.sofka;

import java.util.Scanner;

public class Main {
    
    public static void solucion() {
        String frase;
        long longitudFrase;

        //Ingresar por consola
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        frase = entrada.nextLine();

        //Sacamos la longitud de la frase
        longitudFrase = frase.length();

        //Contar las vocales de la frase
        long cantidadVocales = 0;

        //Recorremos la frase y contamos cuantas vocales tiene
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                cantidadVocales++;
            }
        }

        //Mostramos
        System.out.println("La longitud de la frase es de: "+longitudFrase+" y tiene la cantidad de: "+cantidadVocales+" de vocales");
    }

    public static void main(String[] args) {
        solucion();
    }
}
