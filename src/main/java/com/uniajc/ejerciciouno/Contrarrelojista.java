package com.uniajc.ejerciciouno;

public class Contrarrelojista extends Ciclista {

    // Atributos
    private double velocidadMaxima;

    // Constructor con parametros
    public Contrarrelojista(int identificador, String nombre, int tiempoAcumulado, double velocidadMaxima) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Implementación del método abstracto imprimirTipo
    @Override
    String imprimirTipo() {
        return "Contrarrelojista";
    }

    // Método para imprimir datos específicos de Contrarrelojista
    public void imprimirDatosContrarrelojista() {
        imprimirDatos(); // Llama al método de la clase base para imprimir datos comunes
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
    }

}
