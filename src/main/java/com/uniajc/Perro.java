package com.uniajc;

public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    public void mostrarTruco() {
        System.out.println("El perro hace un truco");
    }

    @Override
    public void comer() {
        System.out.println("El perro come croquetas");
    }

    @Override
    public void caminar() {
        System.out.println("El perro camina");
    }
}
