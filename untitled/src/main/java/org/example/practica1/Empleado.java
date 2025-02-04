package org.example.practica1;

import java.util.Scanner;

public class Empleado {

    Scanner entrada = new Scanner(System.in);

    private int cont = 0;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    public static final String ID_EMP = "EP";

    public Empleado (String nombre, String cargo){

        cont++;
        this.id = carcularID();
        this.nombre = nombre;
        setCargo(cargo);
        this.cargo = cargo;
    }


    public String carcularID(){

        if (cont<10){
            return ID_EMP+"00"+cont;
        } else if (cont<100) {
            return ID_EMP+"0"+cont;
        }else {
            return ID_EMP+cont;
        }

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        if (!director.equals(this.cargo)) {
            this.director = director;
        }

        this.director = null;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {

        if(cargo.equalsIgnoreCase("director") || cargo.equalsIgnoreCase("técnico")
            || cargo.equalsIgnoreCase("presentador") || cargo.equalsIgnoreCase("colaborado")){

            this.cargo = cargo;

        }

        this.cargo = "pte";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString (){
        return "[Empleado = " + getId() + ", Nombre = " + getNombre() + ", Cargo = " + getCargo() + ", Director = " + getDirector() + "]";
    }

}
