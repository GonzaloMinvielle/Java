/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author User
 */
public class SentenciaFor {
    
    public static void main (String [] args){
        
        int [] vector = new int [100];
        
        int cont = 0;
        
        for (int i = 0; i < 100; i++){
            vector [i] = cont;
            cont = cont + 1;
           
        }
        
        for (int j = vector.length-1; j >= 0; j--){
           System.out.print(vector[j]+", ");
      }
    }
    
}
