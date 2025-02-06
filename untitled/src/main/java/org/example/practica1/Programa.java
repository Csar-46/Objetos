package org.example.practica1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporada;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;


    private static int cont = 0;

    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.director = new Empleado(director);
        cadena.agregarPrograma(this);
    }

    public void insertarInvitado(String nombre, String profesion, int temporada) {
        listaInvitados.add(new Invitado(nombre, profesion, temporada));
    }

    public void invitadosTemporada (int temporada) {

        cont = 0;
        for (Invitado invitado : listaInvitados){

            if (invitado.getTemporada() == temporada){

                System.out.println("[Nombre = " + invitado.getNombre() + " Profesión = " + invitado.getProfesion() + "]");
                cont++;
            }

        }

        if (cont == 0){
            System.out.println("Nadie ha querido venir a la temporada " + temporada + " :C");
        } else {
            System.out.println("¡SIUU! En la temporada " + temporada + " hemos tenido " + cont + " invitados :D");
        }

    }

    public void vecesInvitado (String nombre) {

        cont = 0;
        for (Invitado invitado : listaInvitados){

            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                cont++;
            }

        }

        if (cont == 0){
            System.out.println("Por desgracia no tenemos el placer de que " + nombre + " haya venido a visitarnos.");
        } else {
            System.out.println(nombre + " ha venido a vernos " + cont + " " + (cont == 1 ? "vez!" : "veces (Vaya pesadit@)"));
        }

    }

    public void rastrearInvitados(String nombre) {

        for (Invitado invitado : listaInvitados){

            if(invitado.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("[Temporada = " + invitado.getTemporada() + ", Fecha = " + invitado.getFecha_visita() + "]");
                cont++;
            }

        }
        vecesInvitado(nombre);
    }

    public boolean buscarInvitado (String nombre){

        for (Invitado invitado : listaInvitados){

            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                return true;
            }

        }
        return false;
    }

    public void invitadoAntes(String nombre){

        if (buscarInvitado(nombre)){


        }

    }

    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El empleado ya está registrado.");
                return;
            }
        }
        if (!cargo.equals("director")) {
            director = this.director;
        }
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return new ArrayList<>(listaEmpleados);
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = new ArrayList<>(listaEmpleados);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return new ArrayList<>(listaInvitados);
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = new ArrayList<>(listaInvitados);
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
                ", director=" + getDirector() +
                '}';
    }
}
