package Cine;

public class Funcion {
    private Pelicula pelicula;
    private Sala sala;
    private int fecha;

    public Funcion(Pelicula pelicula, String idSala){
        this.pelicula = pelicula;
        sala = new Sala(idSala);
    }
}
