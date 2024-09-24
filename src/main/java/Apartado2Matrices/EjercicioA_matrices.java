package Apartado2Matrices;

import java.util.Scanner;

/*
Crea una matriz con 5 filas y n columnas (Valor que debe pedirse al usuario). 
A continuación, rellénalo con números aleatorios entre 0 y 10. 
Para ello debes crear una función auxiliar que devuelva el número aleatorio generado y se haga la llamada desde la clase Main.
 */

public class EjercicioA_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserte el número de columnas: ");
		int columnas = s.nextInt();
		
		int [][]matriz  = new int[5][columnas];
		
		System.out.print("\n");
		
		// Rellenamos con número aleatorios
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < columnas; j++) {
				
				matriz[i][j] = FuncionesApartado2_matrices.numAleatorios();
				
			}
			
		}
		
		// Mostramos la matriz rellena
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < columnas; j++) {
				
				System.out.print(matriz[i][j]+"\t");
				
			}
			System.out.println("");
		}
		
		s.close();
		
	}

}
