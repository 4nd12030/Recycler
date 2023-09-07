package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnInicio = findViewById(R.id.btnInicio);
        btnInicio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(Login.this, Operario.class);
        startActivity(i);
    }
}