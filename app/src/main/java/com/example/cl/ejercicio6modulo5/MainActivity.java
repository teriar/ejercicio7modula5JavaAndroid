package com.example.cl.ejercicio6modulo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cl.ejercicio6modulo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}