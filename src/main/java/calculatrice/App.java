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
		boolean scien=false;
		if(i==1){
			scien=true;
		}
		
		while(true){
			System.out.println("entrez votre calcul");
			String enter=sc.nextLine();
			
			if(!scien) {
				String[] entersplit=enter.split(" ");
				
				int number1=Integer.parseInt(entersplit[0]);
				int number2=Integer.parseInt(entersplit[2]);

				String operande=entersplit[1];
				if(operande.equals("+")) {
					System.out.println(calcNormal.add(number1,number2));
				}
				if(operande.equals("*")) {
					System.out.println(calcNormal.mul(number1,number2));
				}
			}
			if(scien) {
				
				String tmp2=enter.split("[\\(||//)]")[1];
				String tmp3=enter.split("[\\(||//)]")[0];
				
				
				if(tmp3.equals("sqrt")){
					
					System.out.println(calcScien.RacineCarree(Integer.parseInt(tmp2)));
				}
				if(tmp3.equals("ArcCosinus")){
					System.out.println(calcScien.ArcCosinus(Integer.parseInt(tmp2)));
				}
			}
		}

		//sc.close();
	}
}
