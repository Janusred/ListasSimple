package com.example.listasimple;
import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;
import android.widget.LinearLayout;
public class AdvancedListActivity  extends Activity {

   WearableRecyclerView lista_avanzada;
   AdvancedAdapter adaptador;
   ListaEquipos listaEquipos;
LinearLayoutManager layoutManager;
   @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_advanced_list);

       listaEquipos = new ListaEquipos();
       adaptador= new AdvancedAdapter(listaEquipos);

       lista_avanzada= findViewById(R.id.advanced_recyclerview);
  lista_avanzada.setEdgeItemsCenteringEnabled(true);
         lista_avanzada.setHasFixedSize(true);

       layoutManager = new LinearLayoutManager(this);
       lista_avanzada.setLayoutManager(layoutManager);
       DividerItemDecoration dividerItemDecoration = new
               DividerItemDecoration(lista_avanzada.getContext(),
               layoutManager.getOrientation());
       lista_avanzada.addItemDecoration(dividerItemDecoration);

       lista_avanzada.setAdapter(adaptador);
   }

}
