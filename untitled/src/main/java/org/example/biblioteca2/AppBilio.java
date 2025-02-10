package org.example.biblioteca2;

import org.example.pruebas_lombok.Curso;
import org.example.pruebas_lombok.Estudiante;
import org.example.pruebas_lombok.Instituto;

public class AppBilio {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Lander Adventures", "Lander Vi Ender I", 1916);
        System.out.println(libro1);
        System.out.println();

        libro1.prestarLibro();
        System.out.println(libro1);
        System.out.println();

        libro1.prestarLibro();
        System.out.println();

        libro1.mostrarInformacion();

        libro1.devolverLibro();
        System.out.println();

        libro1.devolverLibro();
        System.out.println();

        libro1.mostrarInformacion();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.buscarLibro("Lander Adventures");


    }

}
