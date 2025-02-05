package org.example.practica1;



import java.util.ArrayList;
import java.util.Scanner;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaPrograma;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaPrograma = new ArrayList<>();
    }

    public void agregarPrograma(String nombre, String director) {
        for (Programa programa : listaPrograma) {
            if (programa.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El programa ya existe.");
                return;
            }
        }
        Programa programa = new Programa(nombre, this, director);
        listaPrograma.add(programa);
    }

    public void eliminarPrograma(String nombre) {
        for (int i = 0; i < listaPrograma.size(); i++) {
            if (listaPrograma.get(i).getNombre().equalsIgnoreCase(nombre)) {
                listaPrograma.remove(i);
                break;
            }
        }
    }

    public ArrayList<Programa> getListaPrograma() {
        return new ArrayList<>(listaPrograma);
    }

    public void setListaPrograma(ArrayList<Programa> listaPrograma) {
        this.listaPrograma = new ArrayList<>(listaPrograma);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Cadena{" +
                ", nombre='" + nombre + '\'' +
                ", listaPrograma=" + listaPrograma +
                '}';
    }
}
