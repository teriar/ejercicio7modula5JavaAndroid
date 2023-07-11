package com.example.cl.ejercicio6modulo5;

public class Presenter {

    private Modelo modelo;
    private IviewPresenter viewPresenter;

    public Presenter(IviewPresenter viewPresenter) {
        this.viewPresenter = viewPresenter;

        modelo = new Modelo();
    }

    public void evaluarContrasena(String password){
        int force = modelo.validarClave(password);

        if(force ==Modelo.DEBIL){
          this.viewPresenter.showWeak();
        }else if (force == Modelo.MEDIA){
          this.viewPresenter.showMedium();
        }else if(force == Modelo.FUERTE){
          this.viewPresenter.showStrong();
        }else{
          this.viewPresenter.showError();
        }


    }

}
