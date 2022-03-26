import Cine.Funcion;
import Cine.Pelicula;
import ParteHumana.Vendedor;

/**
 *Completar FUNCION & completar BOLETO
 *Completar ParteHumana
 *Interconectarla y Hacer la prueba
*/
public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Se hace referencia a la duracion en minutos y se crean 3 Peliculas arbiitrarias
         * para la prueba con diferentes Funciones
        */
        Pelicula peliculaAccion = new Pelicula("Accion", 90);
        Pelicula peliculaComedia = new Pelicula("Comedia", 70);
        Pelicula peliculaRomance = new Pelicula("Romance", 110);

        /**
         * Se generan 3 Funciones con las peliculas definidas anteriormente
         * para la prueba de la App
        */
        Funcion funcion_01 = new Funcion(peliculaAccion, "A01", 60);
        Funcion funcion_02 = new Funcion(peliculaComedia, "B01", 90);
        Funcion funcion_03 = new Funcion(peliculaRomance, "A01", 200);

        /**
         * Se generan 3 tipos de Vendedores para las pruebas
         */
        Vendedor pablo = new Vendedor("Pablo AlgunApellido", "1000231", "Vende tiquetes");
        pablo.datosCliente();
        pablo.generarBoleto(funcion_01);
        pablo.venderBoleto();

        Vendedor juan = new Vendedor("Juan Restrepo", "100888", "Vende tiquetes");
        juan.datosCliente();
        juan.generarBoleto(funcion_02);
        juan.venderBoleto();

        Vendedor angelica = new Vendedor("Angelica Florez", "4483931", "Vende tiquetes");
        angelica.datosCliente();
        angelica.generarBoleto(funcion_03);
        angelica.venderBoleto();
    }
}