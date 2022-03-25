package Cine;

import ParteHumana.Persona;
import ParteHumana.Trabajador;


/*Reescribir multiples cosas,
    -El usuario escoge la silla
    -El usuario escoge la funcion
*/    
public class Boleto {
    
    private Persona cliente;
    private Trabajador vendedor;
    private Funcion funcion;
    private Asiento asiento;
    private TipoBoleto tipoBoleto;
    
    //Constructor
    public Boleto(Persona cliente, Trabajador vendedor, Funcion funcion, Asiento asiento,  String tipoBoleto){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.funcion = funcion;
        comprobarAsiento(asiento);
        configurarTipoBoleto(tipoBoleto);
    }

    //Metodo que confirgura el tipo de Boleto que se planteo en una Enumeracion
    public String configurarTipoBoleto(String tipo){
        
        if(tipo.equalsIgnoreCase("VIP")){
            this.tipoBoleto = TipoBoleto.VIP;
        }else if(tipo.equalsIgnoreCase("Normal")){
            this.tipoBoleto = TipoBoleto.Normal;
        }else{
            return "No existe ese tipo de boleto";
        }

        return  "Se ha cambiado exitosamente a voleto tipo " + tipo;
    }

    private void comprobarAsiento(Asiento asiento){
        //Completar Funcio-Sala-Zonas-Asientos primero
        this.asiento = asiento;
    }

    /*
    /GETTERS
    /   &
    /SETTERS
    */
    public Persona getCliente(){
        return this.cliente;
    }
}


enum TipoBoleto{
    VIP(20), Normal(10);
    private int precio;

    TipoBoleto(int s){precio=s;}

    int getPrecio(){return precio;}
}