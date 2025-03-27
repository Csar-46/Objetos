package org.example.programaME;

import java.util.Scanner;

public class PF {

    static Scanner teclado;

    public static void casoDePrueba() {

        int personas = teclado.nextInt() * 3;
        int saludos = 0;

        for (int i = 0; i < personas; i++) saludos += i;
        System.out.println(saludos);
    }

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
