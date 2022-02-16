package com.sofka;

import java.util.Scanner;

public class Main {

    public static void comparar(int n1, int n2) {
        //Comparar cual es mayor que el otro, o si son iguales
        if (n1 > n2) {
            System.out.println("Numero1: " + n1 + " es mayor que Numero2: " + n2);
        } else if (n2 > n1) {
            System.out.println("Numero2: " + n2 + " es mayor que Numero1: " + n1);

        } else {
            System.out.println("Ambos numeros son IGUALES!!!");
        }
    }

    public static void main(String[] args) {
        int num1, num2;

        //Creamos un obj para que se ingrese los datos (de cualquier tipo)
        Scanner entrada = new Scanner(System.in);

        //Guardar los datos por consola
        System.out.print("Ingrese el Numero1: ");
        num1 = entrada.nextInt(); //Ingresa datos de tipo int

        System.out.print("Ingrese el Numero2: ");
        num2 = entrada.nextInt();

        //Una solucion que podemos hacer es cambiar el tipo de variable a String
        //Y luego convertirlos a double,float,int. Esto hara que no tengamos que
        //Guardar especificamente datos de tipo int, por ejemplo:  "entrada.nextInt();"

        //Llamar funcion
        comparar(num1, num2);
    }
}
