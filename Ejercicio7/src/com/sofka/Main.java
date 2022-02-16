package com.sofka;

import java.util.Scanner;

public class Main {
    public static void solucion(){
        int numero;

        do{ //Pedir hasta que no se salga

            //Pedir datos por consola
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();

        }while(!(numero >= 0));

        //Si es mayor o igual a 0, lo muestra
        System.out.println("El numero es: "+numero);
    }

    public static void main(String[] args) {
	    solucion();
    }
}
