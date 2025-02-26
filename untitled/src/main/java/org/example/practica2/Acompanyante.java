package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Acompanyante extends MutxamelIFC{

    private Jugador jugador;
    private String parentesco;

    public Acompanyante(String nombre, int edad, Jugador jugador, String parentesco) {

        super(nombre, edad);
        this.jugador = jugador;
        this.parentesco = parentesco;

    }

    public void animarEquipo(){



    }

}
