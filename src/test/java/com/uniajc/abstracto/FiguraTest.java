package com.uniajc.abstracto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {

    @Test
    public void testCalcularAreaCuadrado() {
        Cuadrado cuadrado = new Cuadrado(5.0);
        assertEquals(25.0, cuadrado.calcularArea(), 0.001, "El área del cuadrado de lado 5 debería ser 25");
    }

    @Test
    public void testCalcularAreaRectangulo() {
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        assertEquals(24.0, rectangulo.calcularArea(), 0.001, "El área del rectángulo de 4x6 debería ser 24");
    }

    @Test
    public void testCalcularAreaCirculo() {
        Circulo circulo = new Circulo(3.0);
        double areaEsperada = Math.PI * 3.0 * 3.0;
        assertEquals(areaEsperada, circulo.calcularArea(), 0.001, "El área del círculo de radio 3 no es correcta");
    }

    @Test
    public void testPolimorfismo() {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Cuadrado(2.0);    // Area: 4
        figuras[1] = new Rectangulo(2.0, 3.0); // Area: 6
        figuras[2] = new Circulo(1.0);     // Area: PI

        assertEquals(4.0, figuras[0].calcularArea(), 0.001);
        assertEquals(6.0, figuras[1].calcularArea(), 0.001);
        assertEquals(Math.PI, figuras[2].calcularArea(), 0.001);
    }
}
