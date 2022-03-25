package ParteHumana;

import javax.swing.JOptionPane;

/*
    Deberia ser el que contenga el Cliente por datos personales y elecciones
    para asi que solo el boleto al contener trabajador pueda extraer los multiples objetos
*/
public class Vendedor extends Trabajador {

    private Cliente cliente;

    public Vendedor(String nombre, String documento, String puesto) {
        super(nombre, documento, puesto);
    }

    public void venderBoleto(){
        //Despues se rellena
    }

    public void datosCliente(){
        String nombre=leerString("Ingrese su nombre");
        String documento=leerString("Ingrese su documento");
        cliente = new Cliente(nombre, documento);
    }

    //Implementar de mejor forma
    private String leerString(String msj){
        return JOptionPane.showInputDialog(msj);
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    
}
