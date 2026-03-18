package com.uniajc.ejerciciouno;

public class Velocista extends Ciclista {

    // Atributos
    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    // Constructor con parametros
    public Velocista(int identificador, String nombre, int tiempoAcumulado, double potenciaPromedio,
            double velocidadPromedioSprint) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    // Getters y Setters
    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    // Implementación del método abstracto imprimirTipo
    @Override
    String imprimirTipo() {
        return "Velocista";
    }

    // Método para imprimir datos específicos de Velocista
    public void imprimirDatosVelocista() {
        imprimirDatos(); // Llama al método de la clase base para imprimir datos comunes
        System.out.println("Potencia Promedio: " + potenciaPromedio);
        System.out.println("Velocidad Promedio Sprint: " + velocidadPromedioSprint);
    }

}
