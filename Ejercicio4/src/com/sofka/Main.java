package com.sofka;

import java.util.Scanner;

public class Main {

    public static void solucion(){
        double precio, total, IVA = 0.21;

        //Pedir por consola
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = entrada.nextDouble(); //Ingresa datos de tipo double

        total = precio * IVA; //Calculamos el total con el IVA incluido

        System.out.println("El precio final del producto es: "+total);
    }

    public static void main(String[] args) {
        solucion(); //Llamar a la funcion que no se me ocurrio un nombre xD
    }
}
