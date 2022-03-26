package ParteHumana;

public class Cliente extends Persona{

    public Cliente(String nombre, String documento) {
        super(nombre, documento);
    }

    public int seleccionarAsiento(){
        return utilidad.leerInt("Ingrese su asiento: ");
    }
    
    public String seleccionarTipoBoleto(){
        String tipo = utilidad.leerString("Ingrese su tipo de boleto: \nNormal  o  VIP");
        
        while(!(tipo.equalsIgnoreCase("VIP") || tipo.equalsIgnoreCase("Normal"))){
            tipo = utilidad.leerString("Ingrese su tipo de boleto: \nNormal\nVIP");
        }

        return tipo;
    }
}
