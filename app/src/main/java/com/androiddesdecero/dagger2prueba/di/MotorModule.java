package com.androiddesdecero.dagger2prueba.di;

import com.androiddesdecero.dagger2prueba.Coche;
import com.androiddesdecero.dagger2prueba.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

//El Modulo se encarga de proveer a nuestra actividad todas las instancias necesarias
// para que funcionen nuestras clases

//Creamos los modulos-> Para que Dagger Sepa como devolver los objetos que
// van a ser requeridos más adelante

@Module
public class MotorModule {

    //Dentro de los modulos nos encontramos metodos


    //Si deseamos que las instancias que nos proporciona Dagger sean Singleton, solo
    //hace falta anotara la clase o el método con Singleton
    //Recuerda que el patrón singleton, nos permite tener una sola instancia de una clase en toda
    //nuestra App.
    @Singleton
    //En ocasiones necesitamos inyectar distintas implementaciones de una clase,
    //como en este claso nuestra clase Motor, que puede tener una implementación diesel
    //y otra gasolina. Para ello debemos añadir una etiqueta Cualificativa.
    // Esta es cualquier anotación que a su vez tiene la anotación @Qualifier
    // Esto lo podemos hacer con la etiqueta @Named que ya esta incluida en dagger
    @Named("diesel")
    @Provides
    //Utilizamos esta etiqueta @provides delante de los metodos que proporcionan objetos
    // para la Inyección de Dependencias.
    public Motor providesMotorDiesel() {
        return new Motor("Diesel");
    }

    @Singleton
    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina() {
        return new Motor("Gasolina");
    }

    //@Provides
    //public Coche provideCoche(@Named("gasolina")Motor motor){
    //    return new Coche(motor);
    //}
}
