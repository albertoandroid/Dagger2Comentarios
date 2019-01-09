package com.androiddesdecero.dagger2prueba;

import android.content.Context;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

public class Coche {

    private Motor motor;

    /*
    La clase Coche depende de la clase Motor
     */
    public Coche(){
        //La clase Motor no depende de la clase Coche
        //Motor -> Es una dependencia de la Clase Coche
        //Coche depende de -> Motor
        //Motor es una dependencia de Coche
        motor = new Motor("Diesel");
        //Para solucionarlo el new Motor no debería aparecer así,
        //sino que debemos crearlo en otro lugar e inyectarlo.
    }



    public Coche (Motor motor){
        this.motor = motor;
    }

    public String getMotor() {
        return ("Coche con "+ motor.getTipoMotor());
    }
}
