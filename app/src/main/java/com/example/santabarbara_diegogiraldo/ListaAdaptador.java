package com.example.santabarbara_diegogiraldo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.viewHolder> {

    ArrayList<Lugares> listadeDatos;

    public ListaAdaptador(ArrayList<Lugares> listadeDatos) {
        this.listadeDatos = listadeDatos;
    }

    @NonNull
    @Override
    public ListaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaDelItem= LayoutInflater .from(parent.getContext()).inflate(R.layout.item_lista, parent, false);


        return new viewHolder(vistaDelItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.viewHolder holder, int position) {
        holder.actualizarDatos(listadeDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listadeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreLugar;
        ImageView fotoLugar;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreLugar=itemView.findViewById(R.id.nombre1);
            fotoLugar=itemView.findViewById(R.id.fotoparque);


        }

        public void actualizarDatos(Lugares lugares) {
            nombreLugar.setText(lugares.getNombreLugar());
            fotoLugar.setImageResource(lugares.getFotoLugar());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("datosLugares",lugares);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
