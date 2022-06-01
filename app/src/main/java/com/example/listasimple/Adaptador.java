package com.example.listasimple;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.wear.widget.WearableRecyclerView;

import com.example.listasimple.R;

import java.util.ArrayList;


    public class Adaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private ArrayList<String> elementos;
        private String valorPorDefault;
        private static final String TAG = Adaptador.class.getSimpleName();

        public Adaptador(String d, ArrayList<String> l) {
            valorPorDefault = d;
            elementos = l;
            Log.d(TAG, "Elementos 0 en el constructor de adaptador" + elementos.get(0));
        }


        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            //encargado fr actualizar los datos de un View ya existente

            RecyclerView.ViewHolder viewHolder = new SimpleViewHolder
                    (LayoutInflater.from(parent.getContext()).inflate
                    (R.layout.row_item_layout, parent, false), elementos);
            return viewHolder;

        }
        @Override
            public void onBindViewHolder (@NonNull RecyclerView.ViewHolder viewHolder,int position){
                String elemento = elementos.get(position);
                Log.d(TAG, "Elemento en BindView" + elemento);
                SimpleViewHolder elementoViewHolder = (SimpleViewHolder) viewHolder;
                elementoViewHolder.setDato(elemento);


            }

            @Override
            public int getItemCount () {
                return elementos.size();

        }
    }

