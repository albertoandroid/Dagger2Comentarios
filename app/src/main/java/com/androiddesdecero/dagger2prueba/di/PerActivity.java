package com.androiddesdecero.dagger2prueba.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

//Scope -> Ciclo de Vida de las dependencias. Cuando queremos que se destruyan.
/*
A veces deseamos que nuestros objetos solo estan disponibles dentro de un contexto.
Es decir solo queremos que vivan mientras el ciclo de vida de una activity,
o el ciclo de vida de un fragment, o el ciclo de vida de un servicio,
o mientras el usuario este logeado. Cuando se deelogee que muera.
Para ello tenemos la etiqueta Scope
*/
@Scope
@Retention(RetentionPolicy.RUNTIME)//Una vez termine el tiempo de ejecución de nuestra aplicación
// muera el COMPONENTE y con ello todos los Modulos de Nuestro Componente
public @interface PerActivity {
}
