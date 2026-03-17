package com.uniajc;

import com.uniajc.interfaces.INadadores;
import com.uniajc.interfaces.ITerrestres;

// La palabra reservada "extends" se utiliza para indicar que una clase hereda de otra clase, 
// mientras que "implements" se utiliza para indicar que una clase implementa una interfaz.
// Una clase puede heredar de una sola clase, pero puede implementar múltiples interfaces.
public class Animal extends AnimalPadre implements INadadores, ITerrestres {

    public void comer() {
        System.out.println("El animal come");
    }

    @Override
    public void nadar() {
        System.out.println("El animal nada sobreescribiendo el método por defecto");
    }

    @Override
    public void caminar() { 
        System.out.println("El animal camina");
    }

}
