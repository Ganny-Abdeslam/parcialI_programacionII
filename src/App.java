import ParteHumana.Persona;
import ParteHumana.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Persona aleman = new Cliente("A", "1");
        System.out.println(aleman.getNombre() + aleman.getDocumento());
    }
}