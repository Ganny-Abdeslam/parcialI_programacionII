import Cine.Pelicula;
import ParteHumana.Vendedor;

/*
*Completar FUNCION & completar BOLETO
*Completar ParteHumana
*Interconectarla y Hacer la prueba
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*
        *Se hace referencia a la duracion en minutos y se crean 3 Peliculas arbiitrarias
        *para la prueba con diferentes Funciones
        */
        Pelicula peliculaAccion = new Pelicula("Accion", 90);
        Pelicula peliculaComedia = new Pelicula("Comedia", 70);
        Pelicula peliculaRomance = new Pelicula("Romance", 110);

        /*
        *Se generan 3 Funciones con las peliculas definidas anteriormente
        *para la prueba de la App
        */

        //Persona aleman = new Cliente("A", "1");
        Vendedor pablo = new Vendedor("pable", "1000231", "Vende tiquetes");
        pablo.datosCliente();
        //Boleto boleto = new Boleto(aleman, pablo, "Normal");
        System.out.println(pablo.getCliente().getNombre());
    }
}