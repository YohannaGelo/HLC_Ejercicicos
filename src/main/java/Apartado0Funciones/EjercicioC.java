package Apartado0Funciones;

import java.util.Scanner;

/*
Crea una aplicación que nos calcule el área de un circulo, cuadrado o
triangulo. Pediremos que figura queremos calcular su área y según lo introducido pedirá
los valores necesarios para calcular el área. Crea un método por cada figura para calcular
cada área, este devolverá un número real. Muestra el resultado por pantalla.

A continuación puedes ver la fórmula de cada figura:
Circulo: (radio^2)*PI
Triangulo: (base * altura) / 2
Cuadrado: lado * lado
*/

public class EjercicioC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		boolean fin = false;

		while (!fin) {
			int opt = 0;
			
			while (opt < 1 || opt > 4) {
			System.out.println("Seleccione de que figura quiere calcular el área:");

			EjerciciosFunciones.menu();
			opt = s.nextInt();

			}
			
			switch (opt) {
			case 1:
				System.out.print("\nIntroduce el radio: ");
				double radio = s.nextDouble();
				EjerciciosFunciones.areaCirculo(radio);
				System.out.println("\n\n\n");
				break;
			case 2:
				System.out.print("\nIntroduce la base: ");
				double base = s.nextDouble();
				System.out.print("\nIntroduce la altura: ");
				double altura = s.nextDouble();
				EjerciciosFunciones.areaTriangulo(base, altura);
				System.out.println("\n\n\n");
				break;
			case 3:
				System.out.print("\nIntroduce el lado: ");
				double lado = s.nextDouble();
				EjerciciosFunciones.areaCuadrado(lado);
				System.out.println("\n\n\n");
				break;
			default:
				fin = true;

				break;
			}
		}

		System.out.println("\n¡Hasta la próxima!");
		s.close();
	}

}
