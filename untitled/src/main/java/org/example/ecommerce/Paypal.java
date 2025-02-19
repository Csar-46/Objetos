package org.example.ecommerce;

import java.util.Scanner;

public class Paypal extends MetodoPago{

    Scanner entrada = new Scanner(System.in);

    private String cuenta;
    private double saldo;

    private final double SALDO_DEF = 23;
    public static final String CORREO_VALIDO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    public Paypal(){

        System.out.println("Introduce la cuenta de PayPal (email).");
        this.cuenta = pedir();

        this.saldo = SALDO_DEF;

        validarPaypal(cuenta, saldo);

    }

    public String pedir(){
        return entrada.next();
    }

    public void validarPaypal(String email, double saldo){

        System.out.println("Validando tarjeta...");

        if(email.matches(CORREO_VALIDO)){



        }else{
            System.out.println("Los datos de la tarjeta no son correctos.");
        }
    }


    @Override
    public void procesarPago(double importe) {

        System.out.println("Procesando pago de "+ importe +"€ con Paypal");

    }
}
