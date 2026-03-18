package com.uniajc.ejerciciouno;

 abstract class Cicilista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado;

        public Cicilista(int identificador, String nombre, int tiempoAcumulado) {
            this.identificador = identificador;
            this.nombre = nombre;
            this.tiempoAcumulado = tiempoAcumulado;
        }

        //get y set
        
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

        abstract String imprimirTipo();

        public void imprimirDatos(){
            System.out.println("Identificador: " + identificador);
            System.out.println("Nombre: " + nombre);
            System.out.println("Tiempo acumulado: " + tiempoAcumulado);
        }

}
