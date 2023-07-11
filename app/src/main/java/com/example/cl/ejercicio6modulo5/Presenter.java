package com.example.cl.ejercicio6modulo5;

public class Presenter {

    private Modelo modelo;

    public void evaluarContrasena(String password){
        int force = modelo.validarClave(password);

        if(force ==Modelo.DEBIL){

        }else if (force == Modelo.MEDIA){

        }else if(force == Modelo.FUERTE){

        }else{

        }


    }

}
