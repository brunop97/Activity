package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }

    public  void botaoSite (View v) {
        Intent telaSite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br"));
        startActivity(telaSite);
    }

    public  void botaoTelaInicial (View v) {
        Intent telaInicial = new Intent(this, MainActivity.class);
        startActivity(telaInicial);
    }

}