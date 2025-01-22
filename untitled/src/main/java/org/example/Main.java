package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("Luis", 35, 'H',90, 1.90);
        paciente.imprimirInfo();

        Paciente paciente1 = new Paciente();
        paciente1.imprimirInfo();

//        Persona persona1 = new Persona();
//        Persona persona2 = new Persona("Paco", "Ruiz", "12345678A", "Alicante", "Inormatico", 'H', 45);
//
//        Televisor televisor = new Televisor();
//
//        System.out.println("Canal: " + televisor.getCanal() + " Volumen: "+ televisor.getVolumen());
//
//        televisor.subirCanal(televisor.getCanal());
//        televisor.subirVolumen(televisor.getVolumen());


//        persona1.imprimir();
//        persona2.imprimir();
//
//        System.out.println(persona2.concatenar());
//
//        System.out.println("La edad de " + persona2.concatenar() + " es: " + persona2.getEdad());
//        persona1.setApellido("Sin Nombre");
//        System.out.println(persona1.getApellido());

//        persona1.setEdad(16);

//        if (persona1.getEdad() < persona2.getEdad()){
//
//            System.out.println(persona1.getApellido() + " es menor que " + persona2.getApellido());
//
//        }

    }
}