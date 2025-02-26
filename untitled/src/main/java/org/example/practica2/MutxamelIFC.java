package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public abstract class MutxamelIFC implements FuncionesIntegrantes {

    private String nombre;
    private int edad;

    public MutxamelIFC(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;

    }

    public void concentrarse() {

        System.out.println("Consentrasion muy muy fuerte");

    }

    public void viajar(String ciudad) {

        System.out.println("Y nos fuimos pa " + ciudad + ", sin remodimiento.");

    }

    public void celebrarGol() {

        System.out.println("Esto va por vosotros aficion: SIUUUUUUUU!!!!");

    }

}
