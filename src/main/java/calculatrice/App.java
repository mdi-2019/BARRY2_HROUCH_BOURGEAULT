package calculatrice;

import java.util.Scanner;

import org.apache.commons.math3.*;
/**
 * Calculatrice App
 *
 */
 
public class App 
{
public static int init(Scanner sc) {
			
			boolean choix=false;
			int tmp=-1;
			System.out.println("Choisissez le mode normal(n) ou scientifique(s)");
        	
       		 while(!choix) {
        	
        
	        String str = sc.nextLine();
	        
	        if(str.equals("n") || str.equals("N")) {
				System.out.println("Mode Normal");
				tmp=0;
	        	choix = true;
	        }
	        else if (str.equals("s") || str.equals("S")) {
				System.out.println("Mode Scientifique");
				tmp=1;
	        	choix = true;
	        }
	        else {
	        	System.out.println("Saisie incorrecte ! Reessayez");
			}
		}	
		
    	
	return tmp;
}

	public static void main( String[] args )
    {
		Scanner sc = new Scanner(System.in);
		int i=init(sc);
		if(i==0){
			cal= new calcNormal();
		}
		else{
			cal= new calcScien();
		}
		while(true){
		System.out.println("entrez votre calcule");
		String enter=sc.nextLine();
		String[] entersplit=enter.split(" ");
		String tmp2=enter.split("[\\(||//)]")[0];
		String tmp3=enter.split("(")[0];
		int number1=Integer.parseInt(entersplit[0]);
		int number2=Integer.parseInt(entersplit[2]);
		String operande=entersplit[1];
			switch(operande){
				case "+":
				System.out.println(cal.add(number1,number2));
				case "*":
				System.out.println(cal.mul(number1,number2));					
			}
			if(tmp3.equals("sqrt")){
				System.out.println(cal.RacineCarree(Integer.parseInt(tmp2)));
			}
			if(tmp3.equals("ArcCosinus")){
				System.out.println(cal.ArcCosinus(Integer.parseInt(tmp2)));
			}
		}
    	
        //sc.close();
    }
}
