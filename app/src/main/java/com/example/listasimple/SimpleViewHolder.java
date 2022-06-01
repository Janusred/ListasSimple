
 package com.example.listasimple;
 import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.wear.widget.WearableRecyclerView;

import com.example.listasimple.Adaptador;

import java.util.ArrayList;


//public class SimpleViewHolder extends WearableRecyclerView.ViewHolder
//                  implements View.OnClickListener, View.OnContextClickListener {

public class SimpleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private String elemneto;
    private TextView item;
    private ArrayList<String> elementos;

    private static final String TAG = Adaptador.class.getSimpleName();

    public SimpleViewHolder(final View view, ArrayList<String> e) {

        super(view);
        item = (TextView) view.findViewById(R.id.simple_text);
        elementos = e;
        view.setOnClickListener(this);

    }

    public void setDato(String e) {
        item.setText(e);
    }

    @Override
    public void onClick(View v) {
        int position = getAdapterPosition();
        elemneto = elementos.get(position);
        Log.d(TAG, "onClick, elemento:" + elemneto + position);


    }

}

