package com.sofka;

import java.util.Scanner;

public class Main {

    public static void areaCirculo(){
        double area, radio;

        //Pedir los datos por consola
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el Radio: ");
        radio = entrada.nextDouble(); //Ingresa datos de tipo double

        //Carcular el area del circulo (pi*R2).
        area = Math.PI * (Math.pow(radio,2));

        //Hay una forma para no mostrar mas de 2 decimales despues de la coma, no lo vi necesario
        System.out.println("El Area del circulo de Radio: "+radio+" es: "+area);
    }

    public static void main(String[] args) {
        areaCirculo(); //Llamar funcion
    }
}
