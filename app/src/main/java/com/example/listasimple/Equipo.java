package com.example.listasimple;

public class Equipo {
    private String nombrEquipo;
    private String dvivisionEquipo;
    private int logotipoResource;

    public String getNombrEquipo() {
        return nombrEquipo;
    }

    public void setNombrEquipo(String nombrEquipo) {
        this.nombrEquipo = nombrEquipo;
    }

    public String getDvivisionEquipo() {
        return dvivisionEquipo;
    }

    public void setDvivisionEquipo(String dvivisionEquipo) {
        this.dvivisionEquipo = dvivisionEquipo;
    }

    public int getLogotipoResource() {
        return logotipoResource;
    }

    public void setLogotipoResource(int logotipoResource) {
        this.logotipoResource = logotipoResource;
    }

    public Equipo (String n, String d, int r){
        this.nombrEquipo=n;
        this.dvivisionEquipo=d;
        this.logotipoResource=r;

    }

}
