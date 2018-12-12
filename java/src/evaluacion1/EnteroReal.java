package evaluacion1;

import java.util.Scanner;

public class EnteroReal {

	public static void main(String[] args) {
		
		//Enunciado
		/*
		 *   Lee un número real por teclado y muestra por separado su parte entera y su
		 *   parte real
		 */
		
		//variables 

		double n;			//nº a introducir
		int pe;				//Parte entera
		double pr;		//parte real 

		
		// Informo de que necesito un objeto de la clase llamada teclado
		Scanner teclado; 
		
		// Creo el obejeto de la clase escanner llamado teclado
		teclado = new Scanner(System.in); 
		System.out.println("Introduce un valor Real : ");
		
		// Asigno el valor leido por teclado a la variable n
		n = teclado.nextDouble(); 
		
		// Libero la memoria signada al objeto teclado
		teclado.close(); 
		
		//calculo PE (parte entera)
		pe = (int) n;
		
		//calculo PR (parte real)
		pr = n - pe;
		System.out.println("Parte entera " + pe + " Parte real " + pr);
		
 
	}	


}
