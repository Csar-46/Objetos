package org.example;

public class Televisor {

    private int canal;

    public Televisor(){



    }

    public Televisor(int valorCanal){

        getCanal(canal);

    }

    public void subirCanal(){

        getCanal(canal++);

    }
    public void bajarCanal(){

        getCanal(canal--);

    }

    public int getCanal(int canal){

        return this.canal;

    }

    public void setCanal(int canal){

        if (canal >= 1 || canal <= 99){

            this.canal = canal;

        }
    }

}
