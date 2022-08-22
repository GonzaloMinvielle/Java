/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
          
                
        
/**
 *
 * @author User
 */
public class CuadradoMagico {
    
     public static void main (String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //CUADRADO MAGICO
        
        int matriz[][] = new int [3][3];
        
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j <3; j++){
                matriz [i][j] = leer.nextInt();
            }
            
        }
        sumaTotal(matriz);
    }
     public static int sumaTotal (int matriz[][]){
         int f1 = 0;
         int f2 = 0;
         int f3 = 0;
         int c1 = 0;
         int c2 = 0;
         int c3 = 0;
         int d1 = 0;
         int d2 = 0;
         int a = 2;
         int total;
         for (int i = 0; i<3; i++){
             c1 = c1 + matriz [0][i];
             c2 = c2 + matriz [1][i];
             c3 = c3 + matriz [2][i];
             f1 = f1 + matriz [i][0];
             f2 = f2 + matriz [i][1];
             f3 = f3 + matriz [i][2];
             d1 = d1 + matriz [i][i];
         }
         for (int i = 0; i<3; i++){
             d2 = d2 + matriz [a][i];
             a = a - 1;
         }
         total = c1+c2+c3+f1+f2+f3+d1+d2;
         if (c1 == 15 && c2 ==15 && c3 == 15 && f1 == 15 && f2 == 15 && f3 == 15 && d1 == 15 && d2 == 15 ){
             System.out.println("Es un cuadrado magico");
             
         } else {
             System.out.println("No es un cuadrado magico!");
         }
             
                 
         return  total;
     }
}
