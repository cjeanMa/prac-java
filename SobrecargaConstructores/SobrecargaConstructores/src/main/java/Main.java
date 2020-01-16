/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanm
 */
public class Main {
    
    public static void main(String[] args){
        Persona persona1 = new Persona("Robi", 26);
        System.out.println("persona1 = " + persona1);
        
        Empleado empleado1 = new Empleado("Laura", 34, 4000.00);
        System.out.println("empleado1 = " + empleado1);
        
    }
}
