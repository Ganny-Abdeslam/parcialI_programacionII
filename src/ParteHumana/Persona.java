package ParteHumana;

import Utilidades.Utilidad;

public class Persona implements DatosPersonales {
    private String nombre;
    private String documento;
    protected Utilidad utilidad = new Utilidad();

    public Persona(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
    }

    /**
     * GETTERS
     *    &
     * SETTERS
    */
    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void setDocumento(String documento){
        this.documento = documento;
    }

    @Override
    public String getDocumento(){
        return this.documento;
    }
}
