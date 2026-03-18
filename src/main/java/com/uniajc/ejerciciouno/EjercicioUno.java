package com.uniajc.ejerciciouno;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        // Imprimir, añadir, calcular y listar ciclistas en un equipo
        Equipo equipo1 = new Equipo("Equipo A", "Colombia");
        Escalador escalador1 = new Escalador(1, "Escalador Uno", 120, 3.5f, 8.0f);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(2, "Contrarrelojista Uno", 110, 45.0);
        Velocista velocista1 = new Velocista(3, "Velocista Uno", 100, 400.0, 60.0);

        // Imprimir datos de cada ciclista
        System.out.println("Datos del Escalador:");
        escalador1.imprimirDatosEscalador();
        System.out.println("\nDatos del Contrarrelojista:");
        contrarrelojista1.imprimirDatosContrarrelojista();
        System.out.println("\nDatos del Velocista:");
        velocista1.imprimirDatosVelocista();

        // Añadir ciclistas al equipo
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        equipo1.añadirCiclista(velocista1);

        // Imprimir datos del equipo
        System.out.println("\nDatos del Equipo:");
        equipo1.imprimirDatosEquipo();

        // Calcular el tiempo total del equipo
        int tiempoTotal = Equipo.getTiempoTotalEquipo();
        System.out.println("\nTiempo Total del Equipo: " + tiempoTotal + " minutos");

        // Listar ciclistas del equipo
        System.out.println("\nListado de Ciclistas del Equipo:");
        equipo1.listarCiclistas();

        // Buscar un ciclista por su identificador
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el identificador del ciclista a buscar: ");
        int identificadorBuscado = scanner.nextInt();
        boolean encontrado = false;
        for (Ciclista ciclista : equipo1.getCiclistas()) {
            if (ciclista.getIdentificador() == identificadorBuscado) {
                System.out.println("Ciclista encontrado:");
                ciclista.imprimirDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nCiclista con identificador " + identificadorBuscado + " no encontrado.");
        }
        scanner.close();

    }
}
