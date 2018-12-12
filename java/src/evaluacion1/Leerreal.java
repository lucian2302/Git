package evaluacion1;

import java.util.Scanner;

public class Leerreal {

	public static void main(String[] args) {
		
		/*
		 * lee un número real por teclado y muestra por pantalla el mensaje 
		 * "El valor de la variable introducida es"
		 */
		
		Double n;
		
		Scanner teclado;  // Informo de que necesito un objeto de la clase llamada teclado
	
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		
		System.out.println("Introduce un valor entero: ");
		
		n = teclado.nextDouble(); // Asigno el valor leido por teclado a la variable n
		
		
		System.out.println("el valor de la variable es "+ n);

		teclado.close(); // Libero la memoria signada al objeto teclado 
	}	


}
