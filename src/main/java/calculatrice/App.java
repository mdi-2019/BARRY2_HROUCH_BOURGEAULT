package calculatrice;

import java.util.Scanner;

import org.apache.commons.math3.*;
/**
 * Hello world!
 *
 */
 
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	boolean choix = false;
    	
        while(!choix) {
        	System.out.println("Choisissez le mode normal(n) ou scientifique(s)");
        	
	        String str = sc.nextLine();
	        
	        if(str.equals("n") || str.equals("N")) {
	        	System.out.println("Mode Normal");
	        	choix = true;
	        }
	        else if (str.equals("s") || str.equals("S")) {
	        	System.out.println("Mode Scientifique");
	        	choix = true;
	        }
	        else {
	        	System.out.println("Saisie incorrecte ! Reessayez");
	        }
        }
        sc.close();
    }
}
