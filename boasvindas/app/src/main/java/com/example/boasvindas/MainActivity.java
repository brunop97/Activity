package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void botaoLoginOnClick (View v) {
        Intent telaLogin = new Intent(this, Login.class);
        startActivity(telaLogin);
    }

    public  void botaoCadastroOnClick (View v) {
        Intent telaCadastro = new Intent(this, Cadastro.class);
        startActivity(telaCadastro);
    }

    public  void botaoSobreOnClick (View v) {
        Intent telaSobre = new Intent(this, Sobre.class);
        startActivity(telaSobre);
    }
}

