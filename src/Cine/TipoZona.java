package Cine;

public enum TipoZona{
    VIP(40), Normal(100);
    
    private int cantAsientos;

    TipoZona(int s){cantAsientos=s;}

    int numAsientos(){return cantAsientos;}
}