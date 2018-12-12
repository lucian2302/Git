package evaluacion1;

import java.util.Scanner;

public class AAAplantilla {

	public static void main(String[] args) {
	
		//plantilla para leer por teclado y realizar operaciones 
		
		//Enunciado
		/*
		 	*   
		 	* 
		 */
		
		//variables 

		double n;			//Nº que introducimos por teclado 
		int pe;				//
		double pr;		//

		
		// Informo de que necesito un objeto de la clase Scanner llamado teclado
		Scanner teclado; 
		
		// Creo el obejeto de la clase escanner llamado teclado
		teclado = new Scanner(System.in); 
		
		// Mensaje para introducir la variable via teclado
		System.out.println("Introduce un valor Real : ");
		
		// Asigno el valor leido por teclado a la variable n
		n = teclado.nextDouble(); 
		
		// Libero la memoria signada al objeto teclado
		teclado.close(); 
		
		//calculo PE (parte entera) (casting)
		pe = (int) n;
		
		//calculo PR (parte real)
		pr = n - pe;
		
		//Mensaje con el resultado
		System.out.println("Parte entera " + pe + " Parte real " + pr);
		
 
	}	


}
