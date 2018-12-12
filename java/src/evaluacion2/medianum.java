package evaluacion2;

import java.util.Scanner;

public class medianum {

	public static void main(String[] args) {
		// Media de los numeros

		int n, posicion, elementos;
		int[] arrayenteros = new int[5];
		double media;

		Scanner teclado; // Informo de que necesito un objeto de la clase llamada teclado
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt();

		elementos = 0;
		while (elementos < 5 && n >= 0)

		{
			arrayenteros[elementos] = n;
			elementos = elementos + 1;

			if (elementos < 5) {
				System.out.println("Introduce un valor: ");
				n = teclado.nextInt();
			}

		}

		teclado.close();
		posicion = 0;
		media = 0.0;

		while (posicion < elementos) {
			media = media + arrayenteros[posicion];
			posicion = posicion + 1;
		}

		media = media / elementos;

		System.out.println("la media es " + media);
	}

}
