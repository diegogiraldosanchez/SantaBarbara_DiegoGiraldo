package com.example.santabarbara_diegogiraldo;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

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

    public void cambiarIdioma(String leguaje){

        Locale idioma=new Locale(leguaje);
        Locale.setDefault(idioma);

        Configuration configuraciontelefono=getResources().getConfiguration();
        configuraciontelefono.locale=idioma;
        getBaseContext().getResources().updateConfiguration(configuraciontelefono,getBaseContext().getResources().getDisplayMetrics());

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

   public boolean  onOptionsItemSelected(MenuItem item){
       int id=item.getItemId();

       switch (id){

           case(R.id.opcion1):
               Intent intent1=new Intent(Home.this,Asercade.class);
               startActivity(intent1);
               break;
           case(R.id.opcion2):
               cambiarIdioma("en");
               Intent intent2=new Intent(Home.this,Home.class);
               startActivity(intent2);
               break;
           case(R.id.opcion3):
               cambiarIdioma("es");
               Intent intent3=new Intent(Home.this,Home.class);
               startActivity(intent3);
               break;
       }
       return super.onOptionsItemSelected(item);

   }

    private void crearLista(){

        listadeLugares.add(new Lugares(getString(R.string.lugar1),getString(R.string.descripcion1),R.drawable.parque));
        listadeLugares.add(new Lugares(getString(R.string.lugar2),getString(R.string.descripcion2),R.drawable.damasco));
        listadeLugares.add(new Lugares(getString(R.string.lugar3),getString(R.string.descripcion3),R.drawable.cordoncillo));
        listadeLugares.add(new Lugares(getString(R.string.lugar4),getString(R.string.descripcion4),R.drawable.minas));
        listadeLugares.add(new Lugares(getString(R.string.lugar5),getString(R.string.descripcion5),R.drawable.senderismo));


    }


}


