package evaluacion1;

import java.util.Scanner;

public class Signonum {

	public static void main(String[] args) {
		
		/*
		 *  lee un n�mero entero por teclado, lo cambia de signo, y lo muestra por pantalla
		 */
		
		int n;
		
		Scanner teclado;  // Informo de que necesito un objeto de la clase llamada teclado
	
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		
		System.out.println("Introduce un valor entero: ");
		
		n = teclado.nextInt(); // Asigno el valor leido por teclado a la variable n
		n = -n ;
		
		System.out.println("el valor de la variable es "+ n);
		
		

		teclado.close(); // Libero la memoria signada al objeto teclado 
	}	


}
