package com.wesolsv.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNewFrase(View view){

        String[] frases = {
                "Um pequeno pensamento positivo pela manhã, pode mudar todo o seu dia",
                "Pare de desculpas, Just do it!",
                "Continue sonhando e acreditando em suas capacidades",
                "A desesperança vem crescendo dentro de você, mas você pode vencer essa batalha!",
                "Tudo passa confie em Deus",
                "Amor próprio se trata da capacidade de agir em prol do próprio bem estar",
                "O amor pode fazer você superar os dias mais sombrios"
        };
        TextView texto = findViewById(R.id.txtFrase);
        texto.setText(frases[(int)(Math.random() * 6)]);
    }
}