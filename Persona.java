/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Persona {

    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void crearPersona() {

        System.out.println("Ingrese Su nombre");

        this.nombre = leer.next();

        System.out.println("Ingrese su edad");

        this.edad = leer.nextInt();

        while (true) {

            System.out.println("Ingrese su Sexo: M, H, O");
            this.sexo = leer.next();
            if (this.sexo.equalsIgnoreCase("M") || this.sexo.equalsIgnoreCase("H") || this.sexo.equalsIgnoreCase("O")) {
                break;
            }
        }

        System.out.println("Ingrese su peso: ");

        this.peso = leer.nextInt();

        System.out.println("ingrese su altura: ");

        this.altura = leer.nextFloat();

    }

    public void calcularIMC() {
        float imc;

        imc = this.peso / (this.altura * this.altura);

        if (imc < 20) {
            System.out.println("Falta de peso, tu imc es de : " + imc + " por debajo de 20.");
            cont1 += 1;
        } else if (imc > 25) {
            System.out.println("Sobrepeso, tu imc es de : " + imc + " por sobre los 25.");
            cont2 += 1;
        } else {
            System.out.println("Peso ideal, tu imc es de : " + imc + " entre los 20 y 25.");
            cont3 += 1;
        }

    }

    public void mayorEdad() {
        System.out.println("Es mayor de edad?: ");
        boolean aux = true;
        if (this.edad >= 18) {
            System.out.println(aux);
        } else {
            aux = false;
            System.out.println(aux);
        }

    }

    public void calculoIMC() {
        float imc;

        imc = this.peso / (this.altura * this.altura);
        
        

    }
}
