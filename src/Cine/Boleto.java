package Cine;

import Personas.Persona;

public class Boleto {
    
    private Persona cliente;
    private String idVendedor;
    private Funcion funcion;
    private int asiento;
    private double precio;
    private TipoBoleto tipoBoleto;
    
    //Constructor
    public Boleto(Persona cliente,String idVendedor, Funcion funcion, int asiento,  String tipoBoleto){
        this.cliente = cliente;
        this.idVendedor = idVendedor;
        this.funcion = funcion;
        this.asiento = asiento;
        configurarTipoBoleto(tipoBoleto);
        this.precio = this.tipoBoleto.getPrecio();
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
    
    public String informacionBoleto(){
        return ("Nombre del Cliente: " + this.cliente.getNombre()
                + "\nNombre del Vendedor: " + this.idVendedor
                + "\nTipo de Boleto: " + this.tipoBoleto
                + "\nPrecio del Boleto: " + this.precio
                + "\nSala: " + this.funcion.getSala().getIdSala()
                + "\nNumero Asiento: " + this.asiento
                + "\nNombre de la Pelicula: " + this.funcion.getPelicula().getNombre()
                + "\nDuracion de la Pelicula: " + this.funcion.getPelicula().getDuracion()
                + "\nInicion de la Funcion: " + this.funcion.getFechaInicio()
                + "\nFinalizacion de la Funcion: " + this.funcion.getFechaFinalizacion());
    }
}