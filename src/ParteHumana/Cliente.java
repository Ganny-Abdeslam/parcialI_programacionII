package ParteHumana;

import Utilidades.Utilidad;

public class Cliente extends Persona{

    private Utilidad utilidad = new Utilidad();

    public Cliente(String nombre, String documento) {
        super(nombre, documento);
    }

    public int seleccionarAsiento(){
        return utilidad.leerInt("Ingrese su asiento: ");
    }
    
}
