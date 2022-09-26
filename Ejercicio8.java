/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frase.");
        
        c1.setFrase(leer.next());
        
        c1.setLongfrase(c1.getFrase().length());
        
         c1.mostrarVocales();
         System.out.println("");
         
         System.out.println("Frase invertida: ");
         c1.invertirFrase(); 
         
         System.out.println("-----------------------------------");
         
         System.out.println("Que letra desea ver si se repite?");
         c1.vecesRepetido(leer.next());
         
         System.out.println("------------------------------");
         
         System.out.println("Ingrese la frase que desea comparar: ");
         c1.compararLongitud(leer.next());
         
         System.out.println("-------------------------------------------");
         
         System.out.println("Ingrese la frase que quiera agregar: ");
         c1.unirFrases(leer.next());
         
         System.out.println("-------------------------------------------");
         
         System.out.println("Ingrese el caracter que desea poner a cambio de las 'a'");
         c1.reemplazar(leer.next());
         
         System.out.println("-------------------------------------------");
         
         System.out.println("Ingrese la letra que desea buscar.");
        c1.contiene(leer.next());
    }
    
    
}
