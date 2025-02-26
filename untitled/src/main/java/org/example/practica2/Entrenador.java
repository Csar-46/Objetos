package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Entrenador extends MutxamelIFC implements AccionesDeportivas{

    private Equipos equipos;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida) {

        super(nombre, edad);
        this.equipos = equipos;
        this.formacionPreferida = formacionPreferida;

    }

    public void planificarEntrenamiento(){

    }

    public void hacerCambios(){

    }

    public void entrenar() {

    }

    public void jugarpartidos(String rival) {

    }

}
