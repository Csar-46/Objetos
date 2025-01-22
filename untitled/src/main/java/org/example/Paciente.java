package org.example;

import java.util.Random;

public class Paciente {

    public final static char GENERO_BASE = 'X';

    private String nombre;
    private int edad;
    private String DNI;
    private char genero;
    private double peso;
    private double altura;

    public Paciente (){

        this.genero = GENERO_BASE;
        generarDNI();

    }

    public void imprimirInfo(){

        System.out.println(this.nombre + " " + this.edad + " " + this.DNI + " " + this.genero + " " + this.peso + " " + this.altura);

    }


    public Paciente (String nombre, int edad, char genero, double peso, double altura){

        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        generarDNI();

    }

    private void generarDNI(){

        Random aleatorio = new Random();
        int numeroDNI = aleatorio.nextInt(10000000,99999999);
        int resto = numeroDNI % 23;
        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        this.DNI = Integer.toString(numeroDNI) + letras [resto];
    }

}
