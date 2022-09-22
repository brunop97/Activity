package com.example.calculamedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void botaoCalcularOnClick (View v){

        EditText np1Digitado = (EditText) findViewById(R.id.editTextNumberDecimal);
        String np1String = np1Digitado.getText().toString();
        double np1 = Double.parseDouble(np1String);

        EditText np2Digitado = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String np2String = np2Digitado.getText().toString();
        double np2 = Double.parseDouble(np2String);

        double media = (np1 + np2) / 2;

        Intent telaMedia = new Intent(this, MediaFinal.class);
        telaMedia.putExtra("media", media);

        startActivity(telaMedia);

    }
}