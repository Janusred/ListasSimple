package com.example.listasimple;
  import android.util.Log;
  import android.view.View;
  import android.widget.ImageView;
  import android.widget.TextView;

  import androidx.annotation.NonNull;
  import androidx.recyclerview.widget.RecyclerView;


public class AdvancedViewHolder extends RecyclerView.ViewHolder
implements View.OnClickListener{

git 
  private String nombreString;
  private String divisionString;
  private TextView nombreEquipo;
  private TextView nombreDivision;
  private ListaEquipos listaEsquipos;
  private ImageView logotipo;

  private static final String TAG = AdvancedViewHolder.class.getSimpleName();


  public AdvancedViewHolder(@NonNull View view, ListaEquipos lista){
    super (view);
    nombreEquipo= view.findViewById(R.id.nombreEquipo);
    nombreDivision=view.findViewById(R.id.nombreEquipo);
    logotipo= view.findViewById(R.id.logotipo);

    listaEsquipos=lista;
    Log.d(TAG,"en el const , equipos: "+ listaEsquipos.getSize());
    view.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {

  }
}
