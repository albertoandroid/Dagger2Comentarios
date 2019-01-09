package com.androiddesdecero.dagger2prueba;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

public class Motor {

    private String tipoMotor;

    public Motor(String tipoMotor){
        this.tipoMotor=tipoMotor;
    }

    public String getTipoMotor(){
        return ("Motor: "+ tipoMotor);
    }
}
