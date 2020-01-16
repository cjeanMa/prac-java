
import java.util.Date;


public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Empleado empleado1 = new Empleado("Jorge", 5000);
         empleado1.setEdad(25);
         empleado1.setGenero('M');
         empleado1.setDireccion("Jr. Piura");
         System.out.println("empleado1 = " + empleado1);
         
         Cliente cliente1 = new Cliente("Robert", new Date(), true);
         System.out.println("cliente1 = " + cliente1);
    }
    
}
