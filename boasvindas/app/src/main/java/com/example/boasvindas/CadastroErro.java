package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroErro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_erro);

        TextView textCadastroErro = (TextView) findViewById(R.id.textView12);

        Intent telaCadastroErro = getIntent();
        String nome = telaCadastroErro.getStringExtra("nomeDigitado");
        if (nome.isEmpty()){
            nome = " nome,";
        }
        else{
            nome = "";
        }
        String endereco = telaCadastroErro.getStringExtra("enderecoDigitado");
        if (endereco.isEmpty()){
            endereco = " endereco,";
        }
        else{
            endereco = "";
        }
        String numero = telaCadastroErro.getStringExtra("numeroDigitado");
        if (numero.isEmpty()){
            numero = " numero,";
        }
        else{
            numero = "";
        }
        String cep = telaCadastroErro.getStringExtra("cepDigitado");
        if (cep.isEmpty()){
            cep = " CEP,";
        }
        else{
            cep = "";
        }
        String complemento = telaCadastroErro.getStringExtra("complementoDigitado");
        if (complemento.isEmpty()){
            complemento = " complemento,";
        }
        else{
            complemento = "";
        }
        String email = telaCadastroErro.getStringExtra("emailDigitado");
        if (email.isEmpty()){
            email = " email,";
        }
        else{
            email = "";
        }

        textCadastroErro.setText("O(s) campo(s)" + nome + endereco + numero + cep + complemento + email + " esta(ão) vazio(s), favor preencher.");

    }

    public  void botaoVoltar (View v) {
        Intent telaCadastro = new Intent(this, Cadastro.class);
        startActivity(telaCadastro);
    }
}