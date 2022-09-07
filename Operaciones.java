/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggproyectos;

import entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Operacion op = new Operacion();
        System.out.println("Ingrese los numeros que quiere utilizar");
        op.crearOperacion(leer.nextInt(), leer.nextInt());
        
        op.dividir();
        op.sumar();
        op.resta();
        op.multiplicar();
    }
    
}
