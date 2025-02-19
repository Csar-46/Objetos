package org.example.dispositivos;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        ArrayList<Dispositivos> listaDispositivos = new ArrayList<>();

        listaDispositivos.add(new Televisor("LG"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Eacon"));

        for (Dispositivos d : listaDispositivos){

            d.encender();

            if(d instanceof ControlRemoto){

                ((ControlRemoto) d).sincronizar();

            }

            d.mostrarEstado();
            d.apagar();
            d.apagar();
            System.out.println();

        }

    }

}
