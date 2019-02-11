package calculatrice;

import org.apache.commons.math3.*;
/**
 * Hello world!
 *
 */
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Choisissez le mode normal(n) ou scientifique(s)");
        	
        if(args[0].equals("n") || args[0].equals("N")) {
        	
        }
        else {
        	if(args[0].equals("s") || args[0].equals("S")) {
        		
        	}
        	else {
        		System.out.println("Saisie incorrecte! Reessayez");
        	}
        }
        
    }
}
