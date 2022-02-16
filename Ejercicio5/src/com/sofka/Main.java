package com.sofka;

public class Main {

    public static void solucion() {
        //Mostrar numeros impares y pares
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) { //Si es par, mostrar
                System.out.println("Numero PAR: " + i);
            } else { //Sino mostrar numero impar
                System.out.println("Numero IMPAR: " + i);
            }

            i++; //Incremento el contador
        }
    }

    public static void main(String[] args) {
        solucion();
    }
}
