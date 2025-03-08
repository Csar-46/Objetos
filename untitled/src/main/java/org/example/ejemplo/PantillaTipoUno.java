package org.example.ejemplo;

import java.util.Random;
import java.util.Scanner;

public class PantillaTipoUno {

    static Scanner teclado;
    static Random aleatorio = new Random();

    public static void casoDePrueba() {

        int sudoku [][] = new int [9][9];
        int aux;
        int cont = 0;

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = aleatorio.nextInt(9)+1;
            }
        }

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sudoku.length; i++) {

            int[]numVistos = new int [10];

            for (int j = 0; j < sudoku[i].length; j++) {

                aux = sudoku[i][j];

                if(numVistos[aux] == 1){

                    System.out.println("NO");
                    return;

                }

                numVistos[aux] = 1;

            }
        }

        for (int i = 0; i < sudoku.length; i++) {

            int[]numVistos = new int [10];

            for (int j = 0; j < sudoku[i].length; j++) {

                aux = sudoku[j][i];

                if(numVistos[aux] == 1){

                    System.out.println("NO");
                    return;

                }

                numVistos[aux] = 1;

            }
        }

        for (int i = 0; i < sudoku.length; i += 3) {

            for (int j = 0; j < sudoku[i].length; j += 3) {

                int[] numVistos = new int[10];

                for (int k = 0; k < 3; k++) {

                    for (int m = 0; m < 3; m++) {

                        aux = sudoku[i + k][j + m];

                        if (numVistos[aux] == 1) {

                            System.out.println("NO");
                            return;

                        }

                        numVistos[aux] = 1;

                    }
                }
            }
        }

        System.out.println("SI");

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
