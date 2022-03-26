package Cine;

public class Pelicula {
    private String nombre;
    private int duracion;

    public Pelicula(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }

    /**
     * GETTERS
     *    &
     * SETTERS
    */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getDuracion(){
        return this.duracion;
    }
}
