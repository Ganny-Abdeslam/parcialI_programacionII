package Cine;

public class Asiento {
    private boolean ocupado = false;

    public boolean getOcupado(){
        return this.ocupado;
    }

    public void cambiarEstado(){
        this.ocupado = !this.ocupado;
    }
}