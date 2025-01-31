package org.example.casa;


public class AppCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 50);
        casa.agregarHabitacion("Cocina", 70);
        casa.agregarHabitacion("Baño",25);

        casa.mostrarHabitaciones();

        System.out.println("La habitación mas grande es: " + casa.getHabitacionMasGrande());

        casa.agregarHabitacion("Baño",25);
        casa.eliminarHabitacion("Baño");
        casa.mostrarHabitaciones();
    }
}
