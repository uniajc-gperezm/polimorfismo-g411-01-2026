package com.uniajc.ejerciciouno;

public class Escalador extends Ciclista {

    // Atributos
    private float aceleracionPromedio;
    private float gradoRampa;

    // Constructor con parametros
    public Escalador(int identificador, String nombre, int tiempoAcumulado, float aceleracionPromedio,
            float gradoRampa) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    // Getters y Setters
    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    // Implementación del método abstracto imprimirTipo
    @Override
    String imprimirTipo() {
        return "Escalador";
    }

    // Método para imprimir datos específicos de Escalador
    public void imprimirDatosEscalador() {
        imprimirDatos(); // Llama al método de la clase base para imprimir datos comunes
        System.out.println("Aceleración Promedio: " + aceleracionPromedio);
        System.out.println("Grado de Rampa: " + gradoRampa);
    }

}
