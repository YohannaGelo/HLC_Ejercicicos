package Apartado2Matrices;

/*
Crea una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo 
los de los bordes que deben ser 1. Muestra el resultado.
 */


public class EjercicioC_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fila = 8;
		int col = 6;
		int [][]matriz = new int[fila][col];
		
		System.out.println("   MARCO");
		System.out.println("   -----\n");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {

				if (i == 0 || i == fila-1 || j == 0 || j == col-1) {
					
					matriz[i][j] = 1;
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
				

			}
			System.out.println("");
		}
		

	}

}
