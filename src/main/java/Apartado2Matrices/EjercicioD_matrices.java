package Apartado2Matrices;

import java.util.Scanner;

/*
Tabla de 1 dimensión: Pide 5 números que se introducirán ordenados de forma creciente. 
Éstos se guardan en una tabla de tamaño 10. A continuación se pide un número N, el cual 
debe insertarse en el lugar adecuado para que la tabla continúe ordenada.
 */

public class EjercicioD_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int size = 10;
		
		int[] num = new int[size];
        int temp;
        boolean flag = true;
        
        for (int i = 0; i < 5; i++) {
        	System.out.print("Introduce el "+ i +"º numero: ");
        	num[i] = s.nextInt();
		}
        
        

        System.out.println("Array original:");
        for (int n : num) {
            System.out.print(n + " ");
        }

        while (flag) {
            flag = false;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {      //if (num[i] > num[i + 1]) { <-- Para hacer la ordenación descendente
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    flag = true;
                }
            }
        }
        
        System.out.println("\n\nArray ordenado:");
        for (int n : num) {
            System.out.print(n + " ");
        }
        
        System.out.println("\n");     //simplemente para separar el mensaje de BUILD SUCCESSFUL (total time: 2 seconds)
		
		s.close();

	}

}
