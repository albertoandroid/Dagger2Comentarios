package com.androiddesdecero.dagger2prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.dagger2prueba.di.BaseApplication;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;
import dagger.Provides;

/*
    Inyeccion de dependencias
    La inyección de dependencias consiste en un patron de diseño orientado a objetos que trata de que a una
    clase se le suministren los objetos necesarios para poder funcionar. En vez de que la clase sea la que crea los objetos que necesita.

    Los objetos que son utilizados dentro de una clase, no son creados en la clase sino suministrados por alguien, en este caso Dagger
*/
/*
    Dagger 2 es un framework para la inyección de dependencias para Android y Java
    desarrollado por el equipo de Google
    Dependencia -> Significa que una clase usa otra clase.
    Un objeto de la clase A Tiene una referencia de la Clase B
    A depende de -> B
    B es una dependencia de A
*/

public class MainActivity extends AppCompatActivity {

    private Motor motor;

    @Named("diesel")
    @Inject
    public Motor motorDiesel;

    //@Inject
    //public Coche coche;

    /*
    Si el tiempo de instanciar un objeto es alto, por ejemplo iniciar una base de datos
    con datos precargados que pueda durar unos segundos en hacerse y además
    no siempre se va a utilizar durante el tiempo de vida de la app, por ejemplo
    que esto fuera una pestaña en la que pocos usuarios entran,
    podmos indicar su instanciación como Lazy y no se creará hasta que no se
    vaya a utilizar por primera vez.
     */
    //@Inject
    //public Lazy<Coche> cocheLazy;

    /*
    Si queremos una instancia nueva del objeto cada vez que lo utilicemos
    tenemos el Provider.
     */
    //@Inject
    //public Provider<Coche> cocheProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BaseApplication)getApplication()).getMotorComponent().inject(this);


        /*
            Esto es un ejemplo sencillito, cuanto más crece nuestro proyecto más dependencias empieza a haber
            y más complicado sera testear, solucionar bug y expandir del codigo.
            Es decir el objetivo es utilizar el quinto principio de Solid para que nuestro codigo, sea
            más testeable, solucionar bug y expandir el código, además de un codigo más legible.
        */

        motor = new Motor("Gasolina");
        Log.d("TAG1", motor.getTipoMotor());
        Log.d("TAG1", motorDiesel.getTipoMotor());
       // Log.d("TAG1Lazy", cocheLazy.get().getMotor());
       // Log.d("TAG1Lazy", cocheProvider.get().getMotor());
    }
}
