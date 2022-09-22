package com.example.boasvindas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LoginOK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.successfully_login);

        Intent telaLoginOK = getIntent();
    }

    public  void botaoSobre (View v) {
        Intent telaSobre = new Intent(this, Sobre.class);
        startActivity(telaSobre);
    }
    
}
