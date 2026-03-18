package com.uniajc;

public class Main {
    public static void main(String[] args) {

        // Creamos una instancia de la clase Perro
        Perro miPerro = new Perro();


        // Conversion ascendente: Asignamos el objeto de tipo Perro a una variable de tipo Animal
        Animal miAnimal = miPerro;
       
        //miAnimal.mostrarTruco(); // Esto no es posible porque miAnimal es de tipo Animal y no tiene el método mostrarTruco()

        // Conversion descendente: Convertimos la variable de tipo Animal de nuevo a Perro para acceder a métodos específicos de Perro

        if (miAnimal instanceof Perro) {
            Perro miPerro2 = (Perro) miAnimal;
            miPerro2.mostrarTruco();
        } else {
            System.out.println("La conversión no es posible");
        }


        System.out.println("Hello world!");


        Animal animal = new Animal();
        animal.comer();

        Perro perro = new Perro();
        perro.comer();

        Tortuga tortuga = new Tortuga();
        tortuga.comer();
        System.out.println("-----------------------------");
        tortuga.nadar();
        System.out.println("-----------------------------");

        Ornitorinco ornitorinco = new Ornitorinco();
        ornitorinco.comer();

    }
}