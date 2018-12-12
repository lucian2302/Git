package evaluacion1;

import java.util.Scanner;

public class Prueba_reto_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double N1;
		double N2;
		String BTN;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un valor para N1:");

		N1 = teclado.nextDouble();

		System.out.println("Pulsa un boton");

		BTN = teclado.next();

		do {
			
			if (BTN.equals("+")) {
				
			System.out.println("Introduce un valor para N2:");
			N2 = teclado.nextDouble();
			N1 = N1 + N2;
			System.out.println("Pulsa un boton");
			BTN = teclado.next();
			System.out.println(N1);

			}
			
			
		} while (BTN != "=");
		
		System.out.println("Final");

		
		teclado.close();

	}

}
