package org.example.ecommerce;

import org.example.pokedex.Agua;
import org.example.pokedex.Fuego;
import org.example.pokedex.Pokemon;
import org.example.pokedex.Rayo;

import java.util.Scanner;

public class Tienda {

    static Scanner entrada = new Scanner(System.in);
    private static final String [] METODOS_PAGO = {"Bizum", "Paypal", "Tarjeta"};

    public static void iniciarPago(){

        do {
            System.out.println("¿Qué método de pago quieres usar? [Bizum, Paypal, Tarjeta]");
            String metodo = entrada.next().toUpperCase();

            for (int i = 0 ; i < METODOS_PAGO.length ; i++) {
                if(metodo.equalsIgnoreCase(METODOS_PAGO[i])){
                    switch (metodo){
                        case "BIZUM":
                            System.out.println("bisun");
                            return;
                        case "PAYPAL":
                            MetodoPago paypal = new Paypal();
                            return;
                        case "TARJETA":
                            MetodoPago tarjeta = new Tarjeta();
                            return;
                    }
                }
            }
            System.out.println("Método de pago no reconocido.");
        }while(true);
    }

    public static void realizarPago(MetodoPago metodo, double importe){

        

    }


}
