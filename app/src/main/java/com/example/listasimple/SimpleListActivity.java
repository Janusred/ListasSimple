package com.example.listasimple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

public class SimpleListActivity extends Activity {

    private WearableRecyclerView lista_simple;
    private Adaptador adaptadorListaSimple;
    private String valorPorDefault = "Elemento";
    private ArrayList<String> elementos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpe_list);

        rellenar_lista();

        adaptadorListaSimple = new Adaptador(valorPorDefault, elementos);
        lista_simple = findViewById(R.id.simple_recyclerView);

        lista_simple.setEdgeItemsCenteringEnabled(true);
        lista_simple.setLayoutManager(new LinearLayoutManager(this));

        lista_simple.setHasFixedSize(true);
        lista_simple.setAdapter(adaptadorListaSimple);

    }

    public void rellenar_lista() {
        elementos = new ArrayList<String>();
        elementos.add("Lunes");
        elementos.add("Martes");
        elementos.add("Miercoles");
        elementos.add("Jueves");
        elementos.add("Viernes");
    }

}
