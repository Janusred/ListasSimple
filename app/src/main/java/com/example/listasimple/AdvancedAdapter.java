package com.example.listasimple;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdvancedAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ListaEquipos listaEquipos;
    private static final String TAG = AdvancedAdapter.class.getSimpleName();


    public AdvancedAdapter(ListaEquipos lista){
        listaEquipos = lista;
        Log.d(TAG,"en el const "+ lista.getSize());
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
RecyclerView.ViewHolder viewHolder= new AdvancedViewHolder(
        LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_equipo, parent ,false),
                  listaEquipos);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
   Equipo equipo = listaEquipos.getEquipo(position);
   Log.d(TAG,"Equipo elejdo"+ equipo.getNombrEquipo());
   AdvancedViewHolder equipoViewHolder = (AdvancedViewHolder) viewHolder;
   equipoViewHolder.setDato(equipo);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
