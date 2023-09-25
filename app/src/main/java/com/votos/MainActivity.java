package com.votos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Votacion;
    EditText Nombre, Cedula, FechaNa;
    String EditNombre, EditCedula, EditFecha;
    Button VotoA, VotoB, VotoC, Votar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.editTextNombre);
        Cedula = findViewById(R.id.editTextCedula);
        FechaNa = findViewById(R.id.editTextFechaNacimiento);



        VotoA = findViewById(R.id.BotonA);

        VotoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Votacion = "A";
            }
        });

        VotoB = findViewById(R.id.BotonB);

        VotoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Votacion = "B";
            }
        });

        VotoC = findViewById(R.id.BotonC);

        VotoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Votacion = "C";
            }
        });

        Votar = findViewById(R.id.botonEnviar);

        Votar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditNombre = Nombre.getText().toString();
                EditCedula = Cedula.getText().toString();
                EditFecha = FechaNa.getText().toString();

                if (EditNombre.isEmpty() && EditCedula.isEmpty() && EditFecha.isEmpty() && Votacion.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Por favor diligencie todos los datos", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent enviarDatos = new Intent (MainActivity.this, Resultados.class);

                    enviarDatos.putExtra("Nombre", EditNombre);
                    enviarDatos.putExtra("Cedula", EditCedula);
                    enviarDatos.putExtra("FechaNa", EditFecha);
                    enviarDatos.putExtra("Votar", Votacion);
                    startActivity(enviarDatos);

                }
            }

        });

    }
}