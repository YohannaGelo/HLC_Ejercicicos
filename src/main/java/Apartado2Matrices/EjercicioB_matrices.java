package Apartado2Matrices;

import java.util.Scanner;

/*
Crea 2 matrices de mxm y suma sus valores. Los resultados deben almacenarse en otra matriz distinta. 
Los valores y la longitud, seran elegidos por el usuario. Finalmente, muestra por pantalla las matrices 
originales y el resultado, para ello debes crear una función auxiliar que muestre las matrices y se haga 
la llamada desde la clase Main.
 */

public class EjercicioB_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.print("Escribe un tamaño: ");
		int size = s.nextInt();

		int[][] matriz1 = new int[size][size];
		int[][] matriz2 = new int[size][size];
		int[][] resultado = new int[size][size];

		// Rellenamos con número aleatorios ambas matrices
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 1: ");
				matriz1[i][j] = s.nextInt();
				System.out.print("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 2: ");
				matriz2[i][j] = s.nextInt();
				
				resultado [i][j] = matriz1[i][j]+matriz2[i][j];

			}

		}

		// Llamo a la función que muestre las matrices
		FuncionesApartado2_matrices.matrices(size, matriz1, matriz2, resultado);

		s.close();

	}

}
