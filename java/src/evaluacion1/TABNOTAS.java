package evaluacion1;

import java.util.Scanner;

public class TABNOTAS {

	public static void main(String[] args) {
	
		//plantilla para leer por teclado y realizar operaciones 
		
		//Enunciado
		/*
		 	*   lee el sueldo de un trabajador por teclado y muestra por
		 	*   pantalla la retención que se le aplica sabiendo que si 
		 */
		
		//variables 

		double nota;			//nota 
	

		
		// Informo de que necesito un objeto de la clase Scanner llamado teclado
		Scanner teclado; 
		
		// Creo el obejeto de la clase escanner llamado teclado
		teclado = new Scanner(System.in); 
		
		// Mensaje para introducir la variable via teclado
		System.out.println("Introduce un valor Real : ");
		
		// Asigno el valor leido por teclado a la variable n
		nota = teclado.nextDouble(); 
		
		// Libero la memoria signada al objeto teclado
		teclado.close(); 
		
		//condiciones
		if(nota >= 0) {
			
			if (nota < 3) {
				System.out.println("MD");
										}
			
			else if (nota < 5 ) {
				System.out.println("INS");
													}
			
			else if (nota < 6 ) {
				System.out.println("SUF");
													}
			
			else if (nota < 7 ) {
				System.out.println("BIEN");
													}
			
			else if (nota < 9 ) {
				System.out.println("NOT");
													}
			
			else if(nota <=10 ) {
				System.out.println("Sobre");
													}
									} 
	}	


}
