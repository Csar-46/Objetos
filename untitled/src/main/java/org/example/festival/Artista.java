package org.example.festival;

public class Artista extends Persona {

    String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    public void accederEvento(Artista artista){

        System.out.println("Artista: Preparando el show.");

    }

}
