
public class Persona {
    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona(String x){
        
        this.idPersona = ++contadorPersonas;
        this.nombre = x;
    }
           
    public int getIdPersona(){
        return this.idPersona;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    
    public String toString(){
        return "idPersona:"+this.idPersona+"-> Nombre:"+ this.nombre + "-> contador:"+ contadorPersonas;
    }
}
