import ParteHumana.Persona;
import ParteHumana.Trabajador;
import ParteHumana.Vendedor;
import Cine.Boleto;
import ParteHumana.Cliente;
import Cine.Boleto;

public class App {
    public static void main(String[] args) throws Exception {
        Persona aleman = new Cliente("A", "1");
        Trabajador pablo = new Vendedor("pable", "1000231", "Vende tiquetes");
        //Boleto boleto = new Boleto(aleman, pablo, "Normal");
        //System.out.println(boleto.getCliente().getNombre() + boleto.configurarTipoBoleto("normal"));
    }
}