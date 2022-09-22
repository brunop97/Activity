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

        Intent telaCadastroOK = getIntent();
        String nome = telaCadastroOK.getStringExtra("nomeDigitado");

        TextView textCadastroOK = (TextView) findViewById(R.id.textCadastroOK);



        /*
        TextView textResultado = (TextView) findViewById(R.id.textResultado);

        Intent telaNumero = getIntent();
        double numero = telaNumero.getDoubleExtra("numeroDigitado", 0);

        if(numero % 2 == 0){
            textResultado.setText("O Número é PAR");
            textResultado.setTextColor(Color.parseColor("#0000FF"));
            textResultado.setTextSize(20);
        }else{
            textResultado.setText("O Número é IMPAR");
            textResultado.setTextColor(Color.parseColor("#FF0000"));
            textResultado.setTextSize(30);
        }
        //android:text="Ola NOME. Cadastro realizado com sucesso."

        */
    }

    public  void botaoSobre (View v) {
        Intent telaSobre = new Intent(this, Sobre.class);
        startActivity(telaSobre);
    }
}