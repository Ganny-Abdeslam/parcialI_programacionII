package Cine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//LIQUIDADO
public class Funcion {
    private Pelicula pelicula;
    private Sala sala;
    private String fechaFinalizacion;

    public Funcion(Pelicula pelicula, String idSala, int valorInicio){
        this.pelicula = pelicula;
        sala = new Sala(idSala);
        generarHora(valorInicio);
    }

    private void generarHora(int valorInicio){
        /*
        *Se genera una variable LocalDateTime para obtener la fecha actual,
        *para luego se pararla en el Dia y Hora dandole un formato donde luego
        *le sumaremos la duracion de la pelicula y un valor arbitrario por fines practicos
        *para asi obtener la finalizacion de esta funcion.
        *NOTA: Por simplicidad no importa si excede las horas del dia es decir, puede aparecer mas de 24H
        */
        LocalDateTime myDateObj = LocalDateTime.now();
        
        DateTimeFormatter myFormatHourObj = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter myFormatMinObj = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter myFormatDayObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        int formattedHourDate = Integer.parseInt(myDateObj.format(myFormatHourObj));
        int formattedMinDate = Integer.parseInt(myDateObj.format(myFormatMinObj));
        String formattedDayDate = myDateObj.format(myFormatDayObj);

        this.fechaFinalizacion = formattedDayDate+ajustarHora(formattedMinDate +
                                                              pelicula.getDuracion() +
                                                              valorInicio, formattedHourDate);
    }

    private String ajustarHora(int min, int hora){
        int aux = 0;
        
        if(min > 60){
            aux = min/60;
            min = min%60;
            hora = hora + aux; 
        }

        return hora + ":" + min;
    }

    /*
    *GETTERS
    *   &
    *SETTERS
    */
    public Pelicula getPelicula(){
        return this.pelicula;
    }

    public Sala getSala(){
        return this.sala;
    }

    public String getFechaFinalizacion(){
        return this.fechaFinalizacion;
    }
}
