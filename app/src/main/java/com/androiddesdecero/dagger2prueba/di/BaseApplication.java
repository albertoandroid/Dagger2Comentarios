package com.androiddesdecero.dagger2prueba.di;

import android.app.Application;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */


public class BaseApplication extends Application {

    private MotorComponent motorComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        //Clase generada por Dagger. Que es Dagger + Nombre del Componente.
        // Con esto se nos crea el objeto del componente
        motorComponent = DaggerMotorComponent
                .builder()
                .build();

    }

    //metodo que devuleve el objeto creado para poder utilizarlo en la aplicación
    public MotorComponent getMotorComponent(){
        return motorComponent;
    }

}
