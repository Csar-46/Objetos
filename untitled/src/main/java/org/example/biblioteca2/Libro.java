package org.example.biblioteca2;

public class Libro {

    private String titulo;
    private String autor;
    private int anyoPublicacion;
    private boolean disponible;


    public Libro(String titulo, String autor, int anyoPublicacion){

        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        this.disponible = true;

    }

    public void prestarLibro(){

        if(!this.disponible){
            System.out.println("El libro no esta disponible.");
        }else{
            this.disponible = false;
        }

    }

    public void devolverLibro(){

        if(this.disponible){
            System.out.println("El libro ya esta en la biblioteca.");
        }else{
            this.disponible = true;
        }

    }

    public void mostrarInformacion(){

        System.out.println("Libro = [ Título: " + this.getTitulo() + ", Autor: " + this.getAutor() + ", Año: " + this.getAnyoPublicacion() + ", Disponible: " + (disponible ? "Esta disponible!]" : "No lo tenemos actualmente :C]"));

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                ", disponible=" + disponible +
                '}';
    }
}
