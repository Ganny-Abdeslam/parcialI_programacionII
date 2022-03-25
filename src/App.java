import ParteHumana.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        //Persona aleman = new Cliente("A", "1");
        Vendedor pablo = new Vendedor("pable", "1000231", "Vende tiquetes");
        pablo.datosCliente();
        //Boleto boleto = new Boleto(aleman, pablo, "Normal");
        System.out.println(pablo.getCliente().getNombre());
    }
}