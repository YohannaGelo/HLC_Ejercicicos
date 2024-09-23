package Apartado0Funciones;

public class EjerciciosFuncionesApartado0 {

	// Función de repaso simple
	public static void ordenNumeros(int num1, int num2) {
		System.out.println("Muestro números sumados: " + (num1 + num2));
	}

	// Función apartado A
	public static void todosNumeros(int num1, int num2) {

		if (num1 > num2) {

			while (num2 <= num1) {
				System.out.print(num2 + " ");
				num2++;
			}

		} else {

			while (num1 <= num2) {
				System.out.print(num1 + " ");
				num1++;
			}

		}

	}

	// Función suma impares
	public static void sumaImpares(int num1) {

		int suma = 0;

		for (int i = 0; i <= num1; i++) {
			if (i % 2 != 0) {
				suma += i;
				System.out.println("Sumando " + i + "...");
			}

		}

		System.out.println("La suma de todos los impares es: " + suma);
	}

	// Función menú
	public static void menu() {
		System.out.println("+--------------------------+");
		System.out.println("|    1. Círculo            |");
		System.out.println("|    2. Triángulo          |");
		System.out.println("|    3. Cuadrado           |");
		System.out.println("|    ------------------    |");
		System.out.println("|    4. SALIR              |");
		System.out.println("+--------------------------+");

	}

	// Función área círculo (radio^2)*PI
	public static void areaCirculo(double radio) {

		System.out.println("El área del circulo es: " + (Math.pow(radio, 2) * Math.PI));
	}

	// Función área Triangulo: (base * altura) / 2
	public static void areaTriangulo(double base, double altura) {

		System.out.println("El área del circulo es: " + (base * altura));
	}

	// Función área Cuadrado: lado * lado
	public static void areaCuadrado(double lado) {

		System.out.println("El área del cuadrado es: " + (lado * lado));
	}

}
