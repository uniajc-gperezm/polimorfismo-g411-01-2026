package com.uniajc.ejerciciouno;

public class Escalador extends Cicilista {

    private float aceleracionPromedio;
    private float gradoRampa;

    //metodo constructor
    public Escalador(int identificador, String nombre, int tiempoAcumulado) {
        super(identificador, nombre, tiempoAcumulado);
    }

    //metodos get y set
    
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

    
    @Override
    public String imprimirTipo() {
        return "Tipo de ciclista: Escalador";
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración promedio: " + aceleracionPromedio);
        System.out.println("Grado de rampa: " + gradoRampa);
    }
}
