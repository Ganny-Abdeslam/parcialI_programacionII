package ParteHumana;

import Cine.Boleto;
import Cine.Funcion;
/**
 * Deberia ser el que contenga el Cliente por datos personales y elecciones
 * para asi que solo el boleto al contener trabajador pueda extraer los multiples objetos
*/
public class Vendedor extends Trabajador {

    private Cliente cliente;
    private Boleto boleto;

    public Vendedor(String nombre, String documento, String puesto) {
        super(nombre, documento, puesto);
    }

    public void generarBoleto(Funcion funcion){
        String tipoBoleto = cliente.seleccionarTipoBoleto();
        
        int asiento = pedirAsiento(funcion, tipoBoleto);

        boleto = new Boleto(this.cliente, getNombre(), funcion, asiento, tipoBoleto);
    }

    public int pedirAsiento(Funcion funcion, String tipoBoleto){

        utilidad.imprimir("Los asientos van desde: \n 1 - " +
                            funcion.getSala().getZona(tipoBoleto).getCantAsientos());

        int asiento = cliente.seleccionarAsiento();
        
        if(funcion.getSala().getZona(tipoBoleto).getCantAsientos() > asiento){
            if(!funcion.getSala().getZona(tipoBoleto).getAsiento(asiento-1).getOcupado()){
                funcion.getSala().getZona(tipoBoleto).getAsiento(asiento-1).cambiarEstado();
                return asiento;
            }
        }

        pedirAsiento(funcion, tipoBoleto);
        return asiento;
    }

    public void venderBoleto(){
        utilidad.imprimir(boleto.informacionBoleto());
    }

    public void datosCliente(){
        String nombre=utilidad.leerString("Ingrese su nombre: ");
        String documento=utilidad.leerString("Ingrese su documento: ");
        cliente = new Cliente(nombre, documento);
    }

    /**
     * GETTERS
     *    &
     * SETTERS
    */
    public Cliente getCliente(){
        return this.cliente;
    }
    
}
