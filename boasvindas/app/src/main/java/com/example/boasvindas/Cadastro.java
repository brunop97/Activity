package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void botaoSalvar(View v) {

        EditText nomeDigitado = (EditText) findViewById(R.id.editTextTextPersonName);
        String nomeString = nomeDigitado.getText().toString();
        EditText enderecoDigitado = (EditText) findViewById(R.id.editTextTextPersonName2);
        String enderecoString = enderecoDigitado.getText().toString();
        EditText numeroDigitado = (EditText) findViewById(R.id.editTextNumber2);
        String numeroString = numeroDigitado.getText().toString();
        EditText cepDigitado = (EditText) findViewById(R.id.editTextTextPostalAddress);
        String cepString = cepDigitado.getText().toString();
        EditText complementoDigitado = (EditText) findViewById(R.id.editTextTextPersonName4);
        String complementoString = complementoDigitado.getText().toString();
        EditText emailDigitado = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        String emailString = emailDigitado.getText().toString();

        if(     nomeString.equals("") || enderecoString.equals("")    || numeroString.equals("") ||
                cepString.equals("")  || complementoString.equals("") || emailString.equals("") ){

            Intent telaCadastroErro = new Intent(this, CadastroErro.class);
            startActivity(telaCadastroErro);
        } else {
            Intent telaCadastroOK = new Intent(this, CadastroOK.class);
            //getIntent().putExtra("nomeDigitado",nomeString);
            startActivity(telaCadastroOK);
        }

    }

}