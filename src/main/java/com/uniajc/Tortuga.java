package com.uniajc;

public class Tortuga extends Animal {

    @Override
    public void comer() {
        System.out.println("La tortuga come lechuga");
    }

    @Override
    public void nadar() {
        System.out.println("La tortuga nada lentamente");
    }

    @Override
    public void caminar() {
        System.out.println("La tortuga camina lentamente");
    }

}
