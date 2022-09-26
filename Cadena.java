/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Cadena {
    private String frase;
    private int longfrase;
    private int cont = 0;

    public Cadena() {
    }

    public Cadena(String frase, int longfrase) {
        this.frase = frase;
        this.longfrase = longfrase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongfrase() {
        return longfrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongfrase(int longfrase) {
        this.longfrase = longfrase;
    }

    
    public void mostrarVocales(){
                      
        for (int i = 0; i < this.longfrase; i++) {
            String palabra = this.frase.toUpperCase();
           
            if(palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E' || palabra.charAt(i) == 'O' || palabra.charAt(i) == 'I' || palabra.charAt(i) == 'U' ){
                cont++;
            }
       }
        System.out.println("La cantidad de vocales encontradas fueron: "+ cont);
    }
    
    public void invertirFrase(){
        for (int i = this.longfrase - 1; i >= 0 ; i--) {
            System.out.print(this.frase.charAt(i));
            
        }
        System.out.println("");
    }
    
    public void vecesRepetido(String letra){
        int cont1 = 0;
        int aux = 0;
        aux = this.frase.indexOf(letra);
        while (aux != -1){
            cont1 ++;
            aux = this.frase.indexOf(letra, aux+1);           
        }
        System.out.println("La letra "+ letra +" se repite " + cont1 + " veces.");
    }
    
    public void compararLongitud(String frase){

        if( frase.length() == this.longfrase){
            System.out.println("Las frases miden lo mismo.");
        } else {
            System.out.println("Las frases no miden lo mismo.");
        }
    }
    public void unirFrases(String frase){
        String nuevaFrase = this.frase +" "+frase;
        System.out.println(nuevaFrase);
    }
    
    public void reemplazar(String letra){
        
        System.out.println(this.frase.replaceAll("a", letra));
        

        
    }
    public void contiene(String letra){
        System.out.println("La letra se encuentra?");
        
        boolean aux = true;
        
        int verdad = this.frase.indexOf(letra);
        
        if (verdad != -1){
            System.out.println(aux);
        } else {
            System.out.println(!(aux));
        }
    }
}

