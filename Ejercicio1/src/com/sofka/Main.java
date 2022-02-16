package com.sofka;

public class Main {

    public static void comparar(double n1, double n2){
        //Comparar cual es mayor que el otro, o si son iguales
        if(n1 > n2){
            System.out.println("Numero1: "+n1+" es mayor que Numero2: "+n2);
        }
        else if (n2 > n1){
            System.out.println("Numero2: "+n2+" es mayor que Numero1: "+n1);

        }
        else{
            System.out.println("Ambos numeros son IGUALES!!!");
        }
    }


    public static void main(String[] args) {
        double num1 = 5.456, num2 = 5.456;

        //Llamar funcion
        comparar(num1,num2);

    }
}
