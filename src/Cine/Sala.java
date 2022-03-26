package Cine;

import java.util.ArrayList;

public class Sala {
    private String idSala;
    private ArrayList<Zona> zonas;
    private int asientosTotales;

    //La zona normal para fines practicos siempre va ser #0 y la VIP #1 dentro del ArrayList
    public Sala(String idSala){
        this.idSala = idSala;
        zonas = new ArrayList<>();
        zonas.add(new Zona("Normal"));
        zonas.add(new Zona("VIP"));

        asientosTotales = zonas.get(0).getCantAsientos() + zonas.get(1).getCantAsientos();
    }

    /**
     * GETTERS
     *    &
     * SETTERS
    */
    public int getAsientosTotales(){
        return asientosTotales;
    }

    public String getIdSala(){
        return idSala;
    }

    public void setIdSala(String idSala){
        this.idSala = idSala;
    }

    public Zona getZona(String zona){
        
        if(zona.equalsIgnoreCase("VIP")){
            return this.zonas.get(1);
        }

        return this.zonas.get(0);
    }
}