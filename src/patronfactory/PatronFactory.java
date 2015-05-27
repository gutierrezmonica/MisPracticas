/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

/**
 *
 * @author Home User
 */
public class PatronFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Moneda nuevoSol = FactoryMonedas.crearMoneda("USA");
        System.out.println(" Simbolo moneda :" + nuevoSol.obtenerSymbolo());
    }
}
