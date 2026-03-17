package com.uniajc.interfaces;

// Una interfaz es un contrato que define un conjunto de métodos que una clase debe implementar.
public interface INadadores {

    // método por defecto debe tener un cuerpo
    // default void nadar() {
    //     System.out.println("El animal nada por defecto");
    // };

    // método no tiene cuerpo y la clase que lo implemente debe sobreescribirlo obligatoriamente
    void nadar();
}
