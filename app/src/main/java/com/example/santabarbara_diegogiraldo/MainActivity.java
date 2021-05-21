package com.example.santabarbara_diegogiraldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Lugares lugares;

    ImageView fotoLugar;
    TextView nombreLugar, descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fotoLugar=findViewById(R.id.imagen);
        nombreLugar=findViewById(R.id.texto);
        descripcion=findViewById(R.id.descripcion);

        lugares=(Lugares) getIntent().getSerializableExtra("datosLugares");

        fotoLugar.setImageResource(lugares.getFotoLugar());
        nombreLugar.setText(lugares.getNombreLugar());
        descripcion.setText(lugares.getDescripcion());

    }
}