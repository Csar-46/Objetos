package org.example.practica1;

import java.util.Scanner;

public class Empleado {

    Scanner entrada = new Scanner(System.in);

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    private static String [] cargos =  {"director","tecnico","presentador","colaborado"};
    private static int cont = 0;
    public static final String ID_EMP = "EP";

    public Empleado (String nombre){

        setDirector(director);

    }

    public Empleado (String nombre, String cargo, Empleado director){

        this.nombre = nombre;
        setCargo(cargo , cargos);
        cont++;
        this.id = carcularID();
    }


    public String carcularID(){

        return ID_EMP + String.format("%03d",cont);

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
//        if (!director.equals(this.cargo)) {
//            this.director = director;
//        }else{
//            this.director = null;
//        }
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo, String [] cargos) {

        for (String s : cargos) {

            if (s.equalsIgnoreCase(cargo)) {

                this.cargo = cargo;
                return;

            }
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
