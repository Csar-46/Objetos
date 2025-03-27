package org.example.programaME;

import java.util.Scanner;

public class PB {
    static Scanner teclado;

    public static void casoDePrueba() {

        String [] pssw = teclado.nextLine().split("");

        if (pssw.length < 12) {
            System.out.println("ERROR");
            return;
        }

        int min = 0;
        int may = 0;
        int num = 0;
        int sim = 0;

        for (int i = 0; i < pssw.length; i++) {

            if(pssw[i].matches("[a-z]")){
                min++;
                continue;
            }
            if(pssw[i].matches("[A-Z]")){
                may++;
                continue;
            }
            if(pssw[i].matches("[0-9]")){
                num++;
                continue;
            }
            if(pssw[i].matches("[+_)(*&^%$#@!./,;{}]")){
                sim++;
            }

        }

        if(min >= 1 && may>=1 && num>=1 && sim>=1) System.out.println("OK");
        else System.out.println("ERROR");


    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}