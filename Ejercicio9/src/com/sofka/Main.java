package com.sofka;

import java.util.Scanner;

public class Main {

    public static void solucion(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseNueva;

        //Remplazamos las "a" por las "e"
        frase = frase.replace("a","e");
        System.out.print("Frase vieja: "+frase);

        //Ahora nuestra frase con la frase por defecto
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nIngrese una nueva frase:");
        fraseNueva = entrada.nextLine();

        //Concatenamos las frases
        frase = frase.concat(" "+fraseNueva);
        System.out.println("La nueva frase es: \n"+frase);
    }

    public static void main(String[] args) {
	    solucion();
    }
}
