package org.example.festival;

public class Organizador extends Persona {

    private String rol;

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + rol);
    }

    public void accederEvento(Organizador organizador){

        System.out.println("Organizador: Coordinando el evento.");

    }

}
