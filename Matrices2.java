/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Matrices2 {
    
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int matriz [][] = new int [3][3];
        
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++){
                matriz[i][j] = leer.nextInt();
            }
        }
        prueba(matriz);
    }
    
    public static int prueba (int matriz[][] ){
        int matrizT [][] = new int [3][3];
       // int res = 0;
        int cont = 0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrizT[j][i]= matriz[i][j];
            }
        }
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("["+matrizT[i][j]+"] ");
            }
             System.out.println("");
        }
         
          for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                
                if ((matrizT[i][j] + matriz[i][j])== 0){
                    cont = cont + 1;
                    
                }
            }
         
        }
         if (cont == 9){
             System.out.println("Es una matriz anti simetrica." );
         }
         else {
             System.out.println("No es una matriz anti simetrica.");
         }
    return 0;
}
}


