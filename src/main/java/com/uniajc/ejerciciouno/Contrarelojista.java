package com.uniajc.ejerciciouno;

public class Contrarelojista extends Cicilista {

    private double velocidadMaxima;


    public Contrarelojista(int identificador, String nombre, int tiempoAcumulado, double velocidadMaxima) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Tipo de ciclista: Contrarrelojista";
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }

}
