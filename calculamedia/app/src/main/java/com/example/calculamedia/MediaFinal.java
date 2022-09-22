package com.example.calculamedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MediaFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_final);

        TextView textMedia = (TextView) findViewById(R.id.media);
        TextView textSituacao = (TextView) findViewById(R.id.aprovadooureprovado);

        Intent telaNumero = getIntent();
        double numero = telaNumero.getDoubleExtra("media", 0);

        textMedia.setText("Média = " + numero);
        textMedia.setTextSize(30);
        textMedia.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        if(numero >= 7){
            textSituacao.setText("Aprovado!");
            textSituacao.setTextColor(Color.parseColor("#0000FF"));
            textSituacao.setTextSize(30);
            textSituacao.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }else{
            textSituacao.setText("Reprovado");
            textSituacao.setTextColor(Color.parseColor("#FF0000"));
            textSituacao.setTextSize(30);
            textSituacao.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }
    }
}