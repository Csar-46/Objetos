package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Paco", "Ruiz", "12345678A", "Alicante", "Inormatico", 'H', 45);

        persona1.imprimir();
        persona2.imprimir();

        System.out.println(persona2.concatenar());

        System.out.println("La edad de " + persona2.concatenar() + " es: " + persona2.getEdad());
        persona1.setApellido("Sin Nombre");
        System.out.println(persona1.getApellido());

//        persona1.setEdad(16);

//        if (persona1.getEdad() < persona2.getEdad()){
//
//            System.out.println(persona1.getApellido() + " es menor que " + persona2.getApellido());
//
//        }

    }
}