/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EncuestaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Del 1 al 5 cuanto me amas");
        
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Que poco me amas che.");
                    break;
                case 3:
                    System.out.println("Bue, mas de la mitad por lo menos..");
                    break;
                case 4: 
                    System.out.println("Vamoooo, me conformo");
                    break;
                case 5: 
                    System.out.println("Ah estas enganchadisima tota");
                    break;
            }
        } else if (opinion < 0) {
            System.out.println("Te estas yendo a la bosta.");
        } else if (opinion == 0) {
            System.out.println("Keeee, nos separamos");
        } else {
            System.out.println("jajajaj buee, del 1 al 5 era emocion.");
        }
        System.out.println("Gracias por participar.");
// TODO code application logic here
    }
    
}
