package org.principal;

import org.model.Formas.Circulo;
import org.model.Formas.Forma;
import org.model.Formas.Quadrado;
import org.model.Formas.Triangulo;

import java.util.ArrayList;

public class Main_Formas {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        // Adiciona diferentes formas à lista
        formas.add(new Circulo(5));
        formas.add(new Quadrado(4));
        formas.add(new Triangulo(6, 3));

        // Itera sobre as formas chamando os métodos
        for (Forma f : formas) {
            f.desenhar();
            System.out.println("Área: " + f.calcularArea());
            System.out.println("------------------------");
        }
    }
}
