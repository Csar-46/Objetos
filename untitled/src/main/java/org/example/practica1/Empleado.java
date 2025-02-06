package org.example.practica1;

import java.util.Scanner;

public class Empleado {

    private static int contador = 0;
    private static final String ID_EMP = "EP";
    private static final String[] CARGOS_VALIDOS = {"director", "tecnico", "presentador", "colaborador"};

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.cargo = "director";
        this.director = null;
        contador++;
        this.id = generarID();
    }

    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        setCargo(cargo);
        setDirector(director);
        contador++;
        this.id = generarID();
    }

    private String generarID() {
        return ID_EMP + String.format("%03d", contador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        for (String cargoValido : CARGOS_VALIDOS) {
            if (cargoValido.equalsIgnoreCase(cargo)) {
                this.cargo = cargo;
                return;
            }
        }
        this.cargo = "pte";
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        if (cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
