/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

/**
 *
 * @author Home User
 */
public class FactoryMonedas {
    
    public static Moneda crearMoneda(String pais){
        
        if (pais.equalsIgnoreCase("PERU")){
            return new NuevoSol();
        }
         if (pais.equalsIgnoreCase("USA")){
            return new Dolares();
        }
         
         throw new IllegalArgumentException("No existe la moneda para el pais...");
    }
    
    
}
