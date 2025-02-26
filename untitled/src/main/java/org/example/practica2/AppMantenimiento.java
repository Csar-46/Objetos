package org.example.practica2;

public class AppMantenimiento {

    public static void main(String[] args) {

        // crear varios jugadores para el equipo SENIOR

        Jugador mark = new Jugador("Mark", 20, Equipos.SENIOR, 1, Posiciones.PORTERO);
        Jugador axel = new Jugador("Axel", 17, Equipos.SENIOR, 10, Posiciones.DELANTERO);
        Jugador jack = new Jugador("Jack", 19, Equipos.SENIOR, 3,Posiciones.DEFENSA);

        // crear al entrenador del equipo SENIOR

        Entrenador seymour = new Entrenador("Seymour", 80, Equipos.SENIOR, "3-4-3");

        // crear a los masajistas del club

        Masajista jim = new Masajista("Jim", 24, "Técnico", 4);

        // crear a algún acompañante para un par de jugadores

        Acompanyante nelly = new Acompanyante("Nelly", 21, mark, "Pareja");
        Acompanyante silvia = new Acompanyante("Silvia", 18, axel, "Pareja");

        // concentrarse()
        // entrenar()
        // darMasaje() a algún jugador
        // viajar() a Madrid
        // planificarEntrenamiento()
        // entrenar()
        // descansar()
        // calentar()
        // jugarPartido()
        // animarEquipo()
        // hacerCambios()
        // marcarGol()
        // celebrarGol()
        // darMasaje() a varios jugadores
        // viajar() a Mutxamel
        // descansar()

    }

}
