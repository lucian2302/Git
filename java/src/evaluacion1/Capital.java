package evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		
		/*
		 * 	que pide una cantidad en euros, un tipo de interés (ej: 5,5%), y un período de tiempo
		 * expresado en días por pantalla y calcula el interés producido en ese tiempo en base 
		 * a la fórmula Interes=(Cantidad*TipoInteres*Tiempo)/(360*100)

		 */
		
		int	 Tiempo;
		Double Tipo;
		Double Cantidad;
		Double Resultado;
		
		Scanner teclado;  // Informo de que necesito un objeto de la clase llamada teclado
		teclado = new Scanner(System.in); // Creo el obejeto de la clase escanner llamado teclado
		
		//leer cantidad
		System.out.println("Introduce una cantidad: ");
		Cantidad = teclado.nextDouble(); // Asigno el valor leido por teclado a la variable n
		
		//leer Tipo
		System.out.println("Introduce un Tipo de interes (3,5%): ");
		Tipo = teclado.nextDouble();
		
		//leer Tiempo
		System.out.println("Introduce el Tiempo en dias : ");
		Tiempo = teclado.nextInt();
		
		// Libero la memoria signada al objeto teclado 
		teclado.close(); 
		
		Resultado = (Cantidad * Tipo * Tiempo)/(360*100);
		
		
		System.out.printf("el Interes es de %.2f%%" , Resultado);
		
		

		//teclado.close(); 
	}	


}
