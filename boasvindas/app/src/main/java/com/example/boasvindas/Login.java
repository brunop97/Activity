package com.example.boasvindas;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent telaLogin = getIntent();
    }

    public void botaoLogin(View v) {

        EditText emailDigitado = (EditText) findViewById(R.id.editTextTextEmailAddress);
        String emailString = emailDigitado.getText().toString();
        EditText senhaDigitada = (EditText) findViewById(R.id.editTextNumberPassword);
        String senhaString = senhaDigitada.getText().toString();

        if ((emailString == "bruno.peroni@acad.ftec.com.br") && (senhaString == "123456")) {
            Intent telaLoginOK = new Intent(this, LoginOK.class);
            startActivity(telaLoginOK);
        } else {
            Intent telaLoginError = new Intent(this, LoginError.class);
            startActivity(telaLoginError);
        }

    }
}