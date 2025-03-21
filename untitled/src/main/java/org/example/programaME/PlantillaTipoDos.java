package org.example.programaME;

import java.util.Scanner;

public class PlantillaTipoDos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        while(pedirNumero()){}

    }

    public static boolean pedirNumero(){

        int  numero = teclado.nextInt();
        teclado.nextLine();

        if (numero==0){
            return false;
        }else{



            return true;
        }

    }
}
