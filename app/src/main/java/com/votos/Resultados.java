package com.votos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    String RecibirNombre, RecibirCedula, RecibirFecha, RecibirVoto;

    TextView TextNombre, TextCedula, TextFecha, TextVoto;

    Button Imprimir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        Intent intent = getIntent();
        RecibirNombre = intent.getStringExtra("Nombre");
        RecibirCedula = intent.getStringExtra("Cedula");
        RecibirFecha = intent.getStringExtra("FechaNa");
        RecibirVoto = intent.getStringExtra("Votar");

        TextNombre = findViewById(R.id.TextViewNombre);
        TextNombre.setText(RecibirNombre.toString());
        TextCedula = findViewById(R.id.TextViewCedula);
        TextCedula.setText(RecibirCedula.toString());
        TextFecha= findViewById(R.id.TextViewFechaNacimiento);
        TextFecha.setText(RecibirFecha.toString());
        TextVoto = findViewById(R.id.TextViewVoto);
        TextVoto.setText(RecibirVoto.toString());

        Imprimir = findViewById(R.id.botonImprimir);

        Imprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Imprimir = new Intent(Resultados.this, SplashActivity.class);
                startActivity(Imprimir);
            }
        });






    }
}