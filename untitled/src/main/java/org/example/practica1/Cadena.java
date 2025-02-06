package org.example.practica1;
import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    public void agregarPrograma(Programa programa) {

        if (listaProgramas.contains(programa)) {
            System.out.println("El programa ya existe.");
        }else{
            listaProgramas.add(programa);
            programa.setCadena(this);
        }
    }

    public void eliminarPrograma(String nombre) {
        for (int i = 0; i < listaProgramas.size(); i++) {
            if (listaProgramas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                listaProgramas.remove(i);
                break;
            }
        }
    }

    public ArrayList<Programa> getListaProgramas() {
        return new ArrayList<>(listaProgramas);
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = new ArrayList<>(listaProgramas);
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
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}