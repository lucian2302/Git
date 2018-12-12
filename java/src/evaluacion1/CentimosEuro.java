package evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		
		/*
		 *  lee una cantidad en euros por teclado y muestra por separado el número de
		 *  euros y el número de céntimos de euro.
		 */
		
		//variables 

		double n;
		int euros;
		int centimos;

		
		// Informo de que necesito un objeto de la clase llamada teclado
		Scanner teclado; 
		
		// Creo el obejeto de la clase escanner llamado teclado
		teclado = new Scanner(System.in); 
		System.out.println("Introduce un precio : ");
		
		// Asigno el valor leido por teclado a la variable n
		n = teclado.nextDouble(); 
		
		//calculo PE (parte entera)
		euros = (int) n;
		
		//calculo PR (parte real)
		centimos = (int)((n - euros)*100);
		System.out.println("Euros " + euros + " Centimos " + centimos);
		
		// Libero la memoria signada al objeto teclado
		teclado.close();  
	}	


}
