package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginErro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_erro);
    }

    public  void botaoVoltar (View v) {
        Intent telaLogin = new Intent(this, Login.class);
        startActivity(telaLogin);
    }
}