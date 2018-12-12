package evaluacion1;

import java.util.Scanner;

public class VALORABS {

	public static void main(String[] args) {

		// plantilla para leer por teclado y realizar operaciones

		// Enunciado
		/*
		 * Lee el valor de un número entero por teclado y muestra su valor absoluto por
		 * pantalla
		 * 
		 * 
		 */

		// variables

		int n; // Nº que introducimos por teclado
		int R; // Resultado

		// Informo de que necesito un objeto de la clase Scanner llamado teclado
		Scanner teclado;

		// Creo el obejeto de la clase escanner llamado teclado
		teclado = new Scanner(System.in);

		// Mensaje para introducir la variable via teclado
		System.out.println("Introduce un valor Real : ");

		// Asigno el valor leido por teclado a la variable n
		n = teclado.nextInt();

		// Libero la memoria signada al objeto teclado
		teclado.close();

		// si n es positivo
		if (n > 0) {
			R = n;
		}

		// si n es negativo
		else {
			R = -n;
		}

		// Mensaje con el resultado
		System.out.println("El valor absoluto de " + n + " es " + R);

	}

}
