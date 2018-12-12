package evaluacion2;

import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		// Media de los numeros

		int n, posicion;
		int[] arrayenteros = new int[10];

		Scanner teclado; // Informo de que necesito un objeto de la clase llamada teclado
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt();

		while (n >= 0 && n <= 9)

		{
			arrayenteros[n] = arrayenteros[n] + 1;
			n = teclado.nextInt();
		}

		posicion = 1;
		while (posicion < 10) {
			System.out.println(posicion + " : " + arrayenteros[posicion] + " Veces");
			posicion = posicion + 1;
		}
		teclado.close();
	}

}
