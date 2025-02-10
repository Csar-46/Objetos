package org.example.biblioteca2;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados;

    public Usuario (String nombre, int idUsuario){

        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<Libro>();


    }

    public void prestarLibro (Libro libro){

        if(this.librosPrestados.contains(libro)){

            System.out.println("El libro ya ha sido prestado.");
            return;

        }

        if (!libro.isDisponible()){

            System.out.println("El libro ya ha sido prestado.");
            return;

        }

        this.librosPrestados.add(libro);
        libro.prestarLibro();
        System.out.println("El libro se ha prestado con éxito.");

    }

    public void devolverLibro (Libro libro){

        if(!this.librosPrestados.contains(libro)){

            System.out.println("El libro no ha sido prestado.");
            return;

        }

        if (libro.isDisponible()){

            System.out.println("El libro no ha sido prestado.");
            return;

        }

        this.librosPrestados.remove(libro);
        libro.devolverLibro();
        System.out.println("El libro se ha devuelto con éxito.");

    }

    public void listarLibrosPrestados (){

        for (Libro l:this.librosPrestados){

            System.out.println("Libros Prestados: Título: " + l.getTitulo() + ", Autor: " + l.getAutor() + ", Año: " + l.getAnyoPublicacion() + ".");

        }

    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", idUsuario=" + idUsuario +
                ", librosPrestados=" + librosPrestados +
                '}';
    }
}
