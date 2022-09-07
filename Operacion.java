/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author User
 */
public class Operacion {

    private int num1;

    private int num2;
    
    public int suma;
    
    public int resta;
    
    public int mult;
    
    public double div;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion(int a, int b) {
        this.num1 = a;
        this.num2 = b;
                
    }
    
    public void sumar(){
        
      suma =  this.num1 + this.num2;
      
        System.out.println("El resultado de la suma es: "+ suma);
        
    }
    
    public void resta(){
        resta = this.num1 - this.num2;
        
        System.out.println("El resultado de la resta es: "+ resta);
    }
    
    public void multiplicar(){
        if (this.num1 != 0 && this.num2 != 0){
        mult = this.num1 * this.num2;
            System.out.println("El resultado de la multiplicacion es: "+ mult);
                
        } else {
            System.out.println("0" + " Uno o los dos numeros ingresados son igual a 0");
        }
    }
    
    public void dividir(){
        if (this.num1 != 0 && this.num2 != 0){
             div = this.num1 / this.num2;
               System.out.println("El resultado de la division es: "+div);
        }else {
            
            System.out.println("0 : Uno o los dos numeros ingresados son 0");
        }
       
    }

}
