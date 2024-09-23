package Apartado0Funciones;

import java.util.Scanner;

/*
 * Crea una aplicación que muestre en binario un número entre 0 y 255.
 */
public class EjercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num = -1;

		while (num < 0 || num > 255) {
			System.out.print("\nIntroduce un número entre 0 y 255: ");
			num = s.nextInt();
		}
		
		int numOriginal = num;
		String binarioInvertido = "";
		
		while (num > 0) {
			// Voy guardando en una cadena los restos de las divisiones
			binarioInvertido = binarioInvertido + "" + num%2;
			num = num/2;
		}

		// Instancia un objeto
		StringBuilder stringBuilder = new StringBuilder(binarioInvertido);
		// Uso el método reverse para leerlo del revés
		String binario = stringBuilder.reverse().toString();
		
		System.out.println("\n\nEl número " + numOriginal + " en binario es " + binario);
		
		s.close();

	}

}
