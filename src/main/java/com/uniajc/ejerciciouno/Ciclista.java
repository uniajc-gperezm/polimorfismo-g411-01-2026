package com.uniajc.ejerciciouno;

abstract public class Ciclista {
    int identificador;
    String nombre;
    int tiempoAcumulado;

    // Constructor Vacio
    public Ciclista(int identificador, String nombre) {

    }

    // Constructor con parametros
    public Ciclista(int identificador, String nombre, int tiempoAcumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    // Metodo para imprimir tipo ciclista
    abstract String imprimirTipo();

    // Metodo para imprimir datos
    public void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo Acumulado: " + tiempoAcumulado);
    }

}