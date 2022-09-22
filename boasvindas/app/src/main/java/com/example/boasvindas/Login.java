package com.example.boasvindas;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent telaLogin = getIntent();
    }
/*
   public  void botaoSobreOnClick (View v) {
       Intent telaPrincipal = new Intent(this, MainActivity.class);
       startActivity(telaPrincipal);
   }
   */
}
