package com.sofka;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void solucion(){
        String dia;

        //Guardar datos por consola
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana: ");
        dia = entrada.nextLine();
        dia.toLowerCase();

        //Verificar que dia es:
        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.print(dia+" es un Dia Laboral!!!");
                break;
            case "sabado":
            case "domingo":
                System.out.print(dia+" NO se Labura!!!");
                break;
            default:
                System.out.println("Tipo de Dato Invalido!!!");
                break;
        }
    }

    public static void main(String[] args) {
        solucion();
    }
}
