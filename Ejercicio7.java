/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggproyectos;

import entidades.Persona;

;

/**
 *
 * @author User
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        p1.crearPersona();
        p1.calcularIMC();
        p1.mayorEdad();

        p2.crearPersona();
        p2.calcularIMC();
        p2.mayorEdad();

        p3.crearPersona();
        p3.calcularIMC();
        p3.mayorEdad();

        p4.crearPersona();
        p4.calcularIMC();
        p4.mayorEdad();
        System.out.println("----------------------------------------------");
        //Calculo porcentaje de personas mayores y menores.
        if (p1.getEdad() >= 18) {
            cont += 1;
        } else if (p1.getEdad() < 18) {
            cont2 += 1;
        }
        if (p2.getEdad() >= 18) {
            cont += 1;
        } else if (p2.getEdad() < 18) {
            cont2 += 1;
        }
        if (p3.getEdad() >= 18) {
            cont += 1;
        } else if (p3.getEdad() < 18) {
            cont2 += 1;
        }
        if (p4.getEdad() >= 18) {
            cont += 1;
        } else if (p4.getEdad() < 18) {
            cont2 += 1;
        }
        if (cont <= 1) {
            System.out.println("El 100% de las personas son mayores");
        } else {
            System.out.println("El " + (cont * 100) / 4 + "% de las personas es mayor. ");
            System.out.println("El " + (cont2 * 100) / 4 + "% de las personas es menor. ");
        }
        System.out.println("--------------------------------------------------");
        //lleno vector con los imc de las personas.
        float imcp1 = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        float imcp2 = p2.getPeso() / (p2.getAltura() * p2.getAltura());
        float imcp3 = p3.getPeso() / (p3.getAltura() * p3.getAltura());
        float imcp4 = p4.getPeso() / (p4.getAltura() * p4.getAltura());

        float vector[] = {imcp1, imcp2, imcp3, imcp4};
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] < 20) {
                cont3 += 1;
            } else if (vector[i] > 25) {
                cont4 += 1;
            } else {
                cont5 += 1;
            }

        }
        System.out.println("El " + (cont3 * 100) / 4 + "% de las personas esta en falta de peso. ");
        System.out.println("El " + (cont4 * 100) / 4 + "% de las personas padece sobre peso. ");
        System.out.println("El " + (cont5 * 100) /4 + "% de las personas tiene el peso ideal.");
    }

}
