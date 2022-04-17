package com.open_bootcamp;

public class Tema3PrimeraParte {

    /*
    *   Primera parte:
    *   Crear una función con tres parámetros que sean números que se suman entre sí.
    *   Llamar a la función en el main y darle valores.
    */

    public static void main(String[] args) {
        int suma = sumarTresNumeros(10,20,30);
        System.out.println("suma = " + suma);
    }
    
    public static int sumarTresNumeros(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    }
    
}
