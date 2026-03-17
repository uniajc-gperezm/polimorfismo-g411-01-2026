package com.uniajc;

public class Main {
    public static void main(String[] args) {
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