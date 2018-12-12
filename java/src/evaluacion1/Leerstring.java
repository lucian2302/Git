package evaluacion1;

import java.util.Scanner;

public class Leerstring {

	public static void main(String[] args) {
		
		/*
		 * lee un String por teclado y muestra por pantalla el mensaje 
		 * "El valor de la variable introducida es "
		 */
		
		String n;
		
		Scanner teclado;  // Informo de que necesito un objeto de la clase llamada teclado
	
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		
		System.out.println("Introduce un valor String: ");
		
		n = teclado.next(); // Asigno el valor leido por teclado a la variable n
		
		
		System.out.println("el valor de la variable es "+ n);

		teclado.close(); // Libero la memoria signada al objeto teclado 
	}	


}
