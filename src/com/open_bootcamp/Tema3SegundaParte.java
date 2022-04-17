package com.open_bootcamp;

public class Tema3SegundaParte {

    /*  Segunda parte:
     *  Crear una clase coche.
     *  Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
     *  Una función que incremente el número de puertas que tiene el coche.
     *  Crear un objeto miCoche en el main y añadirle una puerta.
     *   Mostrar el número de puertas que tiene el objeto.
     */

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println("Puertas = " + miCoche.puertas);
        miCoche.incrementarPuertas();
        System.out.println("Puertas = " + miCoche.puertas);
    }
}


class Coche {

    public int puertas;

    public Coche() {
        this.puertas = 0;
    }

    public void incrementarPuertas() {
        this.puertas++;
    }

}