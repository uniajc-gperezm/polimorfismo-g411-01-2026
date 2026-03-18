package com.uniajc;

import com.uniajc.interfaces.IVoladores;

public class Ornitorinco extends Animal implements IVoladores {

    @Override
    public void comer() {
        System.out.println("El ornitorrinco come insectos y pequeños crustáceos");
    }

    @Override
    public void nadar() {
        System.out.println("El ornitorrinco nada con sus patas palmeadas");
    }

    @Override
    public void caminar() {
        System.out.println("El ornitorrinco camina con sus patas cortas");
    }

    @Override
    public void volar() {
        System.out.println("El ornitorrinco no puede volar");
    }

}
