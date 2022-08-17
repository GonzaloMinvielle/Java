/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**package test;

import java.util.Scanner;


 *
 * @author User
 */
/* public class BUCLES {
    public static void main (String[] args){
        
        Scanner leer = new Scanner(System.in);
        EJERCICIO 1 BUCLES/
        int limite = 10;
        
        
        
        int suma = 0;
        
        while (suma <= limite){
            System.out.println("ingrese numeros hasta superar el limite");
            
            int num = leer.nextInt();
            
            suma = suma + num;
        }
        System.out.println("Paso el limte");
       
        EJERCICIO 2 BUCLES.
        System.out.println("Ingrese 2 numeros enteros");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        boolean aux = false;
        boolean bandera = true;
        
        
        System.out.println("Que desea hacer con sus numeros?");

        do {
        System.out.println("1-Sumar "
                + "2-Restar "
                + "3-Multiplicar "
                + "4-Dividir "
                + "5-Salir ");
        
                int op = leer.nextInt();
        double cuenta = 0;
        
      
        
        if (op >=1 && op <=5){
            
        switch(op){
            case 1:
               cuenta = num1 + num2;
               
                  break;
            case 2: 
               cuenta = num1 - num2;
                
                  break;
            case 3: 
                cuenta = num1 * num2;
                
                  break;
            case 4:
                cuenta = num1 / num2; 
      
                break;
                
            case 5: 
                
                System.out.println("Esta seguro que quiere salir?: S/N");
                
                String op2 = leer.next();
                
               if (op2.equals("S")){
                    
                   
                    
                    bandera = true;
                    
               } else {
               bandera = false;
               aux = true;
               }
                    
                }   
        
              } else {
            System.out.println("Numero incorrecto");
        }
           if (aux != true){
        System.out.println("El resultado es: " + cuenta);
           }
        } while ( bandera != true) ;
        
         System.out.println("Saliendo del programa...");*/
    
        
        
        /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
        
        
       
        
      String FDE = "&&&&&";
      
       boolean aux = false;
        
       int cont = 0;
        
       int cont2 = 0;
       
       
         
       do {
           
        System.out.println("ingrese su cadena de 5 caracateres q comience con la letra X y finalice con O:"); 
       
         String cadena = leer.nextLine();
         
        int longitud = cadena.length();
         
         if (cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
             
             cont = cont + 1;
         } else {
              cont2 = cont2 + 1;
         }
         
         if ( cadena.equals(FDE)){  
             
             System.out.println("La cantidad de lecturas correctas fueron: " + cont);
             System.out.println("La cantidad de lecturas incorrectas fueron: " + cont2);
             
             break;
         } else {
             
            
            }
         
         
            
            
         
       }while (aux != true );
        System.out.println("Saliendo del programa...");
        
        System.out.println("Ingrese el tamanio de su cuadrado: ");
        
        int tam = leer.nextInt();
        // parte superior cuadrado
        for (int i = 0; i < tam; i++){
            System.out.print("*");
        }
        
        System.out.println(" ");
        //centro del cuadrado
        for(int i = 0; i < tam - 2; i++){
            System.out.print("*");
            for (int j = 0; j < tam - 2; j ++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        // parte inferior 
        for (int i = 0; i < tam; i++){
            System.out.print("*");
        }
    }
    
  
    
}*/
