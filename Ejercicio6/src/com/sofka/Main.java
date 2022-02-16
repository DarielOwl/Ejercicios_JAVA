package com.sofka;

public class Main {

    public static void solucion() {

        //Mostrar numeros impares y pares
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) { //Si es par, mostrar
                System.out.println("Numero PAR: " + i);
            } else { //Sino mostrar numero impar
                System.out.println("Numero IMPAR: " + i);
            }
        }

    }

    public static void main(String[] args) {
       solucion();
    }
}
