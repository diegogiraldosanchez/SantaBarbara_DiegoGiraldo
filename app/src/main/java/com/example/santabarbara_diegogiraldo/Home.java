package com.example.santabarbara_diegogiraldo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {


    ArrayList<Lugares> listadeLugares= new ArrayList<>();
    RecyclerView listadoGrafico;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listadoGrafico=findViewById(R.id.listados);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearLista();
        ListaAdaptador adaptador= new ListaAdaptador(listadeLugares);
        listadoGrafico.setAdapter(adaptador);

    }

    private void crearLista(){

        listadeLugares.add(new Lugares("PARQUE PRINCIPAL","Exhibe dos placas en homenaje a líderes del municipio. Se pude disfrutar de una buena arborización, bancas y casetas de venta de comestibles. Santa Bárbara es un municipio , localizado en la subregión Suroeste del departamento de Antioquia.",R.drawable.parque));
        listadeLugares.add(new Lugares("CORREGIMIENTO DE DAMASCO","Le llaman “Pesebre Escondido” debido a la situación topográfica en que se encuentra: rodeado de montañas y colinas, formando un hermoso paisaje. Aún se conservan algunas casas de la época de la colonia y el empedrado de la Calle Principal a la Calle Real, declarado Patrimonio Arquitectónico por el Concejo Municipal de Santa Bárbara.",R.drawable.damasco));
        listadeLugares.add(new Lugares("ALTO DE CORDONCILLO"," Colina con vista al cañón del río Cauca. Desde aquí se practica parapentismo.",R.drawable.cordoncillo));
        listadeLugares.add(new Lugares("ALTO DE MINAS","En los límites con el municipio de Caldas, desde donde se divisa Santa Bárbara, el río Cauca, el río Poblanco y otros municipios del Suroeste Antioqueño.  Con servicios de restaurantes.",R.drawable.minas));
        listadeLugares.add(new Lugares("SENDERISMO","-Ruta Hacia La Riqueza Hídrica Alto de Minas. -Ruta del Río Buey, pesca deportiva. -Ruta aventura por el Río Poblanco.",R.drawable.senderismo));


    }


}


