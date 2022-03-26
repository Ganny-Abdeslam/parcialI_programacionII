package ParteHumana;

public class Trabajador extends Persona {

    protected String puesto;

    public Trabajador(String nombre, String documento, String puesto) {
        super(nombre, documento);
        this.puesto = puesto;
    }

    /**
     * GETTERS
     *    &
     * SETTERS
    */
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public String getPuesto(){
        return this.puesto;
    }

    public void datosCliente() {
    }
}
