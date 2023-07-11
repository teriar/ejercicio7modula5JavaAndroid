package com.example.cl.ejercicio6modulo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.cl.ejercicio6modulo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements  IviewPresenter {

    private Presenter presenter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        presenter = new Presenter(this);
        binding.txtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
             presenter.evaluarContrasena(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void showWeak() {
        Toast.makeText(this, "la contraseña es debil", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showMedium() {
        Toast.makeText(this, "la contraseña es media", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showStrong() {
        Toast.makeText(this, "la contraseña es fuerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}