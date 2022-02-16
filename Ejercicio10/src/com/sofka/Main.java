package com.sofka;

import java.util.Scanner;

public class Main {

    public static void solucion() {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseNueva;

        //Ahora nuestra frase con la frase por defecto
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase:");
        fraseNueva = entrada.nextLine();

        //Eliminar los espacios en blanco
        fraseNueva = fraseNueva.replace(" ","");

        //Mostrar frase sin espacios
        System.out.println(fraseNueva);
    }

    public static void main(String[] args) {
        solucion();
    }
}
