package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		
		/*
		 *   lee el valor del radio por teclado y muestra el valor de la circunferencia de ese
		 *   radio por pantalla con dos decimales
		 */
		
		Double n;
		Double Resultado;
		
		
		Scanner teclado;  // Informo de que necesito un objeto de la clase llamada teclado
	
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		
		System.out.println("Introduce un valor entero: ");
		
		n = teclado.nextDouble(); // Asigno el valor leido por teclado a la variable n
		
		Resultado = n * n * n;
		
		
		System.out.println("el valor de la variable es " + Resultado);
		
		

		teclado.close(); // Libero la memoria signada al objeto teclado 
	}	


}
