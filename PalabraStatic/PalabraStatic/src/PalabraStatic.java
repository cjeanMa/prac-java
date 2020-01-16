/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanm
 */
public class PalabraStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona x = new Persona("Robin");
        System.out.println("x = " + x);
        System.out.println("Nombre= "+ x.getNombre());
        System.out.println("idPersona= " + x.getIdPersona());
        System.out.println("Contador= " + Persona.getContadorPersonas());
        // los metodos static no necesitan ser llamados desde el objeto
        // No es recomendable llamar un metodo static desde un objeto inicializado
        Persona y = new Persona("Batman");
        System.out.println("y = " + y);
        System.out.println("Nombre= "+ y.getNombre());
        System.out.println("idPersona= " + y.getIdPersona());
        System.out.println("Contador= " + Persona.getContadorPersonas());
    }
    
}
