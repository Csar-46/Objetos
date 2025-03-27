package org.example.programaME;

import java.util.Arrays;
import java.util.Scanner;

public class PE {
    static Scanner teclado;

    public static void casoDePrueba() {

        String [] numeros = teclado.nextLine().split(" ");
        Arrays.sort(numeros);

        int total = 0;

        for (int i = 0; i < numeros.length; i++) {
            total += Integer.parseInt(numeros[i]);
        }

        if(total>100){
            System.out.println("INVALIDO");
            return;
        }

        boolean esPrimo = true;

        for (int i = 0; i < numeros.length; i++) {
            if(Integer.parseInt(numeros[i]) % i == 0){

                esPrimo = false;

            }
        }

        if (esPrimo) System.out.println("VALIDO");
        else System.out.println("INVALIDO");

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
