package org.example.festival;

public class Asistente extends Persona {
    private String entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, String entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al metodo de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    @Override
    public void accederEvento(){

        System.out.println("Asistente: Buscando su asiento.");

    }

}
