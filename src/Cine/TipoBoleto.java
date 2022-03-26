package Cine;

public enum TipoBoleto{
    VIP(20), Normal(10);
    
    private int precio;

    TipoBoleto(int s){precio=s;}

    int getPrecio(){return precio;}
}