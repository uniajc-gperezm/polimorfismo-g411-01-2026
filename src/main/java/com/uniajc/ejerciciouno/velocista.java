package com.uniajc.ejerciciouno;

public class velocista extends Cicilista {

    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    //metodo constructor
    public velocista(int identificador, String nombre, int tiempoAcumulado, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    //get y set 

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



    @Override
    public String imprimirTipo() {
        return "Tipo de ciclista: Velocista";
    }


    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad promedio en sprint: " + velocidadPromedioSprint);
    }



}
