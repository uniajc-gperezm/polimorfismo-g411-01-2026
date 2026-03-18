package com.uniajc.ejerciciouno;
import java.util.List;
import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Cicilista> cicilistas;

    //constructor inicializando la lista
    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.cicilistas = new ArrayList<>();
    }

    //constructor
    public Equipo(String nombreEquipo, String pais, int tiempoTotalEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
        this.cicilistas = new ArrayList<>();
    }

    //get y setter
    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    protected void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    //metodos

    protected void añadirCiclista(Cicilista ciclista){
        cicilistas.add(ciclista);
    }

    public void imprimirDatos(){
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("Pais: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo);
        System.out.println("Ciclistas:");
        for (Cicilista ciclista : cicilistas) {
            System.out.println("- " + ciclista.getNombre());
        }
    }

    public void listarNombreciclistas(){
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Cicilista ciclista : cicilistas) {
            System.out.println("- " + ciclista.getNombre());
        }
    }

    public void imprimirDatosCiclistaPold(int tiempoPold){
        System.out.println("Datos de los ciclistas del equipo " + nombreEquipo + ":");
        for (Cicilista ciclista : cicilistas) {
            if (ciclista.getTiempoAcumulado() > tiempoPold) {
                System.out.println("- " + ciclista.getNombre() + ", Tiempo: " + ciclista.getTiempoAcumulado());
            }
        }
    }   
}
