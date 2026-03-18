package com.uniajc.abstracto;

public class App {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        Figura cuadrado = new Cuadrado(3);

        circulo.mostrarArea();
        rectangulo.mostrarArea();
        cuadrado.mostrarArea();
    }
}
