package com.androiddesdecero.dagger2prueba.di;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */
import com.androiddesdecero.dagger2prueba.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

//Componente es el puente entre los modulos creados y la parte del código que solicita
// esos objetos para hacer la inyección de dependencias.

@Singleton
@PerActivity   // Para decirle el Ciclo de Vida de los Componentes @PREACTIVITY
@Component(modules={MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
