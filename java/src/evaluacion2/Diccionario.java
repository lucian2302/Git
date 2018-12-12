package evaluacion2;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// Media de los numeros

		String cadena;
		int elementos, res, posicion;
		String[] arraycadena = new String[10];

		Scanner teclado; // Informo de que necesito un objeto de la clase llamada teclado
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		elementos = 0;

		while (!cadena.isEmpty() && elementos < 10)

		{

			// buscar la posicion
			posicion = 0;
			while (posicion < elementos)

			{
				if (cadena.compareTo(arraycadena[posicion]) < 0) {
					break;
				}
				posicion = posicion + 1;
			}

			for (int posmov = elementos; posmov > posicion; posmov--) {
				arraycadena[posmov] = arraycadena[posmov - 1];
			}
			arraycadena[posicion] = cadena;

			elementos = elementos + 1;

			System.out.println("Introduce una cadena: ");
			cadena = teclado.nextLine();
		}

		teclado.close();
		for (posicion = 0; posicion < elementos; posicion++) {
			System.out.println(arraycadena[posicion]);
		}
	}
}
