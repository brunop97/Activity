package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginOK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ok);

        Intent telaLoginOK = getIntent();
    }

    public  void botaoSobre (View v) {
        Intent telaSobre = new Intent(this, Sobre.class);
        startActivity(telaSobre);
    }
}