package com.uniajc.abstracto;

public abstract class Figura {

    public abstract double calcularArea();

    public void imprimir() {
        System.out.println("El área de esta figura es: " + calcularArea());
    }
}
