package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CadastroOK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_ok);

        TextView textCadastroOK = (TextView) findViewById(R.id.textCadastroOK);

        Intent telaCadastroOK = getIntent();
        String nome = telaCadastroOK.getStringExtra("nomeDigitado");
        textCadastroOK.setText("Ola " + nome + "! Cadastro realizado com sucesso.");

    }

    public  void botaoSobre (View v) {
        Intent telaSobre = new Intent(this, Sobre.class);
        startActivity(telaSobre);
    }
}