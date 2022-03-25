package ParteHumana;

import Utilidades.Utilidad;

import javax.swing.JOptionPane;

/*
    Deberia ser el que contenga el Cliente por datos personales y elecciones
    para asi que solo el boleto al contener trabajador pueda extraer los multiples objetos
*/
public class Vendedor extends Trabajador {

    private Cliente cliente;
    private Utilidad utilidad = new Utilidad();

    public Vendedor(String nombre, String documento, String puesto) {
        super(nombre, documento, puesto);
    }

    public void venderBoleto(){
        //Despues se rellena
    }

    public void datosCliente(){
        String nombre=utilidad.leerString("Ingrese su nombre: ");
        String documento=utilidad.leerString("Ingrese su documento: ");
        cliente = new Cliente(nombre, documento);
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    
}
