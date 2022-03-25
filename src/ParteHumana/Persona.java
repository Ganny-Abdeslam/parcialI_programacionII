package ParteHumana;

public class Persona {
    private String nombre;
    private String documento;

    public Persona(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
    }

    /*
    /GETTERS
    /   &
    /SETTERS
    */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getDocumento(){
        return this.documento;
    }
}
