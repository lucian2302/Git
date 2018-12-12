package evaluacion1;

import java.util.Scanner;

public class Leernum {

	public static void main(String[] args) {
		
		/*
		 * Lee un número entero por teclado y lo muestra por pantalla
		 */
		
		int n;
		
		Scanner teclado;  // Informo de que necesito un objeto de la clase llamada teclado
	
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		
		System.out.println("Introduce un valor entero: ");
		
		n = teclado.nextInt(); // Asigno el valor leido por teclado a la variable n
		
		
		System.out.println("el valor de la variable es "+ n);

		teclado.close(); // Libero la memoria signada al objeto teclado 
	}	


}
