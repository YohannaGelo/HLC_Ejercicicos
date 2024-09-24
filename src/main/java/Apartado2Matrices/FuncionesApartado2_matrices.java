package Apartado2Matrices;

public class FuncionesApartado2_matrices {

	// Función apartado A
	public static int numAleatorios() {

		return (int) (Math.random() * 11); // Aleatorio del 0 al 10

	}

	// Función apartado B
	public static void matrices(int size, int matriz1[][],int matriz2[][],int resultado[][]) {
		
		// Mostramos ambas matrices
		System.out.println("\nMatriz 1");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(matriz1[i][j] + "\t");

			}
			System.out.println("");
		}

		System.out.println("\nMatriz 2");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(matriz2[i][j] + "\t");

			}
			System.out.println("");

		}
		
		System.out.println("\nMatriz Resultado");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(resultado[i][j] + "\t");

			}
			System.out.println("");

		}
	}
	
	
	
	
}
