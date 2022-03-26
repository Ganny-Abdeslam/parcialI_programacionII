package ParteHumana;

import Cine.Funcion;

public class PersonalMantenimiento extends Trabajador{ 

    public PersonalMantenimiento(String nombre, String documento, String puesto) {
        super(nombre, documento, puesto);
    }

    public void limpiarSala(Funcion funcion){
        utilidad.imprimir("El empleado: " + getNombre()
                            + "\nLimpiando la sala: " + funcion.getSala().getIdSala());
    }
    
}
