package org.example.ecommerce;

import java.util.Scanner;

public class Tarjeta extends MetodoPago {

    Scanner entrada = new Scanner(System.in);

    private String nro_tarjeta;
    private String tipo;

    public Tarjeta (){

        System.out.println("Introduce los datos de tu tarjeta: ");
        System.out.println("Número (16 dígitos): ");
        this.nro_tarjeta = pedir();

        System.out.println("¿De qué tipo es tu tarjeta (VISA o MASTERCARD): ");
        this.tipo = pedir();

        validarTarjeta(nro_tarjeta, tipo);

    }

    public String pedir(){
       return entrada.next().toUpperCase();
    }

    public void validarTarjeta(String num, String tipo){

        System.out.println("Validando tarjeta...");

        if(num.length() == 16){
            if(tipo.equals("VISA") || tipo.equals("MASTERCARD") || tipo.equals("MAESTRO")){

                procesarPago(pedirImporte());

            }else{
                System.out.println("Los datos de la tarjeta no son correctos.");
            }
        }else{
            System.out.println("Los datos de la tarjeta no son correctos.");
        }
    }

    public double pedirImporte(){

        System.out.println("Introduce el importe a pagar: ");
        return entrada.nextDouble();
    }

    @Override
    public void procesarPago(double importe) {



    }
}
