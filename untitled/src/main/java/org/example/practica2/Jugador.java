package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Jugador extends MutxamelIFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {

        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;

    }

    public void calentar(){

    }

    public void descarsar(){

    }

    public void marcarGol(){

    }

    public void entrenar() {

    }

    public void jugarpartidos(String rival) {

    }

}
