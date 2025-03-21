package org.example;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Persona> integrantes;

    public Equipo (String nombre){

        this.nombre = nombre;
        integrantes = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public void insertarIntegrantes(Persona persona){
        integrantes.add(persona);
    }

    public void borrarIntegrantes(Persona persona){
        integrantes.remove(persona);
    }

    @Override
    public String toString(){
        return "Equipo: [Nombre = " + getNombre() + " Integrantes = " + integrantes + " ]";
    }

}
