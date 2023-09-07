package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnEntrar, btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.BtnEntrar);
        btnEntrar.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Login.class);
            startActivity(i);
        });

        btnRegistrar = findViewById(R.id.BtnRegistro);
        btnRegistrar.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Registro.class);
            startActivity(i);
        });
    }
}