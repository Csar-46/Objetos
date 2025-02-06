package org.example.practica1;
import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;
    private int anyo;
    private int mes;
    private int dia;

    private LocalDate fecha = LocalDate.of(2025,3,15);

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        pedirFecha();
        this.temporada = temporada;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita=fecha_visita;
    }


    public void pedirFecha(){
        System.out.println("Introduce el año en el que acudirá el invitado " + getNombre() + ":");
        anyo = entrada.nextInt();
        System.out.println("Introduce el mes:");
        mes = entrada.nextInt();
        System.out.println("Introduce el día:");
        dia = entrada.nextInt();
        this.fecha_visita = LocalDate.of(anyo,mes,dia);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
