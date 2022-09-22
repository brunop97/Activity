package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastroErro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_erro);
    }

    public  void botaoVoltar (View v) {
        Intent telaCadastro = new Intent(this, Cadastro.class);
        startActivity(telaCadastro);
    }
}