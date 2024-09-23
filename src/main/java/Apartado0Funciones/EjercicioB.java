package Apartado0Funciones;

import java.util.Scanner;

/*
Escriba una función que sume los n primeros números impares de un valor
elegido por el usuario.
*/
public class EjercicioB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un número: ");
		int num1 = s.nextInt();
		
		EjerciciosFunciones.sumaImpares(num1);

		
		s.close();
	}

}
