package com.open_bootcamp;

public class Tema9 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Oscar Rojas");
        cliente.setEdad(44);
        cliente.setTelefono("5136677");
        cliente.setCredito(5000);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Ingrid Diaz");
        trabajador.setEdad(34);
        trabajador.setTelefono("3130373");
        trabajador.setSalario(2800);

        System.out.println("------ INFO CLIENTE ---------");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        System.out.println("------ INFO TRABAJADOR ---------");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
        
    }

}

/*
* No se implementa clase persona por estar ya implementada
* en este mismo package.
 */

class Cliente extends Persona {
    private float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}