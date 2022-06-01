package com.example.listasimple;

import java.util.ArrayList;

public class ListaEquipos {
    private ArrayList<Equipo>equipos;

    public ListaEquipos(){
        equipos=new ArrayList<Equipo>();
        //Colocando la informacion de cada equipo
        Equipo e1=new Equipo(" Mercedes Pretonas Rancing ","Escuderia en Formula 1", R.drawable.logo1);
        equipos.add(e1);
        Equipo e2=new Equipo("Oracle RedBull Rancing", "Escuderia de formula 1", R.drawable.Janus2);
        equipos.add(e1);
        Equipo e3=new Equipo(" ferrari", "Escuderia Formula 1", R.drawable.logo3);
        equipos.add(e1);
        Equipo e4=new Equipo(" McClaren", "Escuderia Formula 1", R.drawable.logo4);
        equipos.add(e1);
        Equipo e5=new Equipo(" Astron martin", "Escuderia Formula 1", R.drawable.logo5);
        equipos.add(e1);
    }
    public int  getSize(){
        return equipos.size();

    }
    public Equipo getEquipo(int position){
        return equipos.get(position);
    }
}
