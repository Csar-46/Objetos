package org.example.practica1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporada;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;


    public Programa (String nombre, Cadena cadena, String director){

        this.nombre = nombre;
        this.cadena = cadena;
        temporada = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        //
        this.director = new Empleado (director);
        //

    }

    public void insertarInvitado (String nombre, String profesion, int temporada){

        for (Invitado invitado: listaInvitados){

            if(invitado.getNombre().equals(nombre)){
                System.out.println("El invitado ya esta registrado.");
                return;
            }
        }
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
    }

    public void insertarEmpleado (String nombre, String cargo, Empleado director){

        for (Empleado empleado : listaEmpleados){

            if (empleado.getNombre().equals(nombre)){
                System.out.println("El empleado ya esta registrado.");
                return;
            }
        }
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporada=" + temporada +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
