package org.example.practica1;



import java.util.ArrayList;
import java.util.Scanner;

public class Cadena {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private ArrayList<Programa> listaPrograma;


    public Cadena(String nombre){

        this.nombre = nombre;
        this.listaPrograma = new ArrayList<>();

    }

    public void agregarPrograma(String nombre, Cadena cadena) {

        for (Programa programa: listaPrograma){

            if(programa.getNombre().equals(nombre)){
                System.out.println("El programa ya exixte.");
                return;
            }

        }
        Programa programa = new Programa(nombre, cadena);
        listaPrograma.add(programa);
    }

    public ArrayList<Programa> getListaPrograma() {
        return listaPrograma;
    }

    public void setListaPrograma(ArrayList<Programa> listaPrograma) {
        this.listaPrograma = listaPrograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
