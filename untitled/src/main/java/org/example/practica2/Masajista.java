package org.example.practica2;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Masajista extends MutxamelIFC{

    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia) {

        super(nombre, edad);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;

    }

    public void darMasaje(Jugador jugador){

        throw new Mal();

    }


}
