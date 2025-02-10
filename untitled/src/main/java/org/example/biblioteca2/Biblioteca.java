package org.example.biblioteca2;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuariosRegistrados;

    public Biblioteca (){

        this.catalogo = new ArrayList<Libro>();
        this.usuariosRegistrados = new ArrayList<Usuario>();

    }


    public void agregarLibro (Libro libro){

        if(catalogo.contains(libro)){

            System.out.println("El libro ya esta en el catálogo de la biblioteca :C");
            return;

        }

        catalogo.add(libro);
        System.out.println("El libro se ha añadido correctamente al catálogo!!");

    }

    public void registrarUsuario (Usuario usuario){

        if(usuariosRegistrados.contains(usuario)){

            System.out.println("El ususario ya ha sido registrado :C");
            return;

        }

        usuariosRegistrados.add(usuario);
        System.out.println("Elusuario se ha registrado con éxito a la biblioteca!!");

    }

    public void buscarLibro (String titulo){

        for (Libro l : catalogo){

            if (titulo.equalsIgnoreCase(l.getTitulo())){

                System.out.println("El libro '" + l.getTitulo() + "' está en el catálogo!");
                return;

            }
        }

        System.out.println("El libro no está en el catalogo :C");

    }

    public void mostrarCatalogo (){

        System.out.println("Libros disponibles:");

        for (Libro l:this.catalogo){

            if (l.isDisponible()) {
                System.out.println("Título: " + l.getTitulo() + ", Autor: " + l.getAutor() + ", Año: " + l.getAnyoPublicacion() + ".");
            }
        }
    }


    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public ArrayList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public void setUsuariosRegistrados(ArrayList<Usuario> usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }

}
