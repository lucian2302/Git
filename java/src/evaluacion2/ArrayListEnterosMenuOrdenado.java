package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenado {

	public static void main(String[] args) {
		// muestra un men� por pantalla con las siguientes opciones

		// - A�adir Palabra. Pide una palabra y la a�ade al array, si todav�a no existe,
		// en la posici�n que le
		// corresponda alfab�ticamente.

		// - Buscar Palabra. Pide una palabra y la busca en el array. Si la encuentra la
		// muestra y si no la encuentra
		// muestra un mensaje de error.

		// - Borrar Palabra. Pide una palabra y la elimina, si es que existe, del array.
		// Si no la encuentra muestra un
		// mensaje de error.

		// - Listar Diccionario. Muestra todos los elementos del diccionario por
		// pantalla, si es que tiene elementos,
		// ordenados alfab�ticamente.

		// - Salir. Realiza las operaciones necesarias para la correcta finalizaci�n del
		// programa.


		int  num, opcion, posicion;
		ArrayList<Int> arraynum= new ArrayList<Int>();
		Scanner teclado;
		
		// informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in);
		// creo el objeto de la clase Scanner llamado teclado
		// escribo el menu
		System.out.println("elige una opcion: ");
		System.out.println("1.A�adir   un numero");
		System.out.println("2.Buscar   un numero");
		System.out.println("3.Borrar   un numero");
		System.out.println("4.Listar los numeros");
		System.out.println("0.Salir  del programa");
		// pido la opcion
		System.out.println("opcion: ");
		// leo la opcion
		opcion = teclado.nextInt();
		while (opcion != 0) {
			// con cada opcion

			switch (opcion) {
			
			
			// pido una palabra
			case 1:
				// limpio el buffer
				teclado.nextInt();
				System.out.println("Introduce un numero ");
				num = teclado.nextInt();
				// si no esta en el diccionario todavia
				if (!arrayListString.contains(num)) {
					arrayListString.add(num);
				}
				break;
			
				//busco una palabra
			case 2:
				teclado.nextLine();
				System.out.println("palabra que quiere buscar: ");
				cadenab = teclado.nextLine();
				if (arrayListString.contains(cadenab)) 
				{
					System.out.println("la palabra palabra : "+ cadenab + " esta en el diccionario");
				}
				else {
					System.out.println("la palabra no esta");
				}
				break;
				
				
				//borro una palabra
			case 3:
				teclado.nextLine();
				System.out.println("palabra que quiere borrar: ");
				cadenabr = teclado.nextLine();
				if (arrayListString.contains(cadenabr))
				{
					arrayListString.remove(cadenabr);
					System.out.println("palabra borrada");
				}
				else {
					System.out.println("la palabra no esta");
				}
				
				break;
				
				// muestro el contenido del arrayList
			case 4:
				Collections.sort(arrayListString);
				for (posicion = 0; posicion < arrayListString.size(); posicion++) {
					System.out.println(arrayListString.get(posicion));
				}
				break;

			case 0:
				System.out.println("fin del programa");
				break;
			}
			// pido otra opcion
			System.out.println("opcion: ");
			opcion = teclado.nextInt();
		}
		teclado.close();
	}

}
