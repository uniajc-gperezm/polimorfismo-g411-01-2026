package com.uniajc.ejerciciouno;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private java.util.List<Ciclista> ciclistas;

    // Constructor con parametros
    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new java.util.ArrayList<>();
    }

    // Getters y Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public static void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public java.util.List<Ciclista> getCiclistas() {
        return ciclistas;
    }

    public void setCiclistas(java.util.List<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    // Metodo añadir ciclista al equipo
    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        tiempoTotalEquipo += ciclista.getTiempoAcumulado(); // Suma el tiempo del ciclista al tiempo total del equipo
    }

    // Metodo para imprimir datos del equipo
    public void imprimirDatosEquipo() {
        System.out.println("Nombre del Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo Total del Equipo: " + tiempoTotalEquipo);
        System.out.println("Ciclistas del Equipo:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre() + " (" + ciclista.imprimirTipo() + ")");
        }
    }

    // Metodo para listar los nombres de los ciclistas del equipo
    public void listarCiclistas() {
        System.out.println("Ciclistas del Equipo " + nombreEquipo + ":");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre());
        }
    }

    // Metodo para imprimir datos del ciclista por identificador
    public void imprimirDatosCiclistaPorId(int identificador) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == identificador) {
                ciclista.imprimirDatos();
                break;
            }
        }
    }

}
