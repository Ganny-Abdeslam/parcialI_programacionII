package Cine;

import java.util.ArrayList;

//LIQUIDADO
public class Zona {

    private int cantAsientos;
    private TipoZona tipoZona;
    private ArrayList<Asiento> asientos;

    public Zona(String tipoZona){
        
        configurarTipoZona(tipoZona);
        this.cantAsientos = this.tipoZona.numAsientos();

        asientos = new ArrayList<>();
        generarAsientos();
    }

    //Metodo que confirgura el tipo de Zona que se planteo en una Enumeracion
    public void configurarTipoZona(String tipo){
        
        if(tipo.equalsIgnoreCase("VIP")){
            this.tipoZona = TipoZona.VIP;
        }else if(tipo.equalsIgnoreCase("Normal")){
            this.tipoZona = TipoZona.Normal;
        }
    }

    //Generar la cantidad adecuada de asientos que se tiene por zonas
    private void generarAsientos(){
        for(int i=0; i<this.cantAsientos;i++){
            asientos.add(new Asiento());
        }
    }

    /*
    *GETTERS
    *   &
    *SETTERS
    */
    public int getCantAsientos(){
        return cantAsientos;
    }

    public String getTipoZona(){
        //Se obtiene como un String para el manejo y visualizacion mas sencilla del tipo de zona
        return "" + tipoZona;
    }
}