package com.uniajc.abstracto;

abstract class Figura {

    abstract double calcularArea();

    public void mostrarArea() {
        double area = calcularArea();
        System.out.println("El área de la figura es: " + area);
    }
}
