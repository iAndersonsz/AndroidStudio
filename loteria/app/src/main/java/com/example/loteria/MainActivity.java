package com.example.loteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void botaoSorteio(View v){

        int x = new Random().nextInt(61);

        TextView texto = findViewById(R.id.numeroSorteado);
        texto.setText("_" + x + "_");

    }

}