package Apartado1claseString;

import java.util.Scanner;

/*
Crea una función que calcule y retorne cuántos días hay entre dos cadenas
de texto que representen fechas.
 - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 - La función recibirá dos String y retornará un int.
 - El usuario eligirá el orden de las fechas (Cuál de las 2 fechas será la primera y cuál será la
segunda). A continuación muestra el orden en el que quedan. Usa el mínimo de
variables posible.
- La diferencia en días será absoluta (no importa el orden de las fechas).
- Para facilitar el ejercicio suponemos que todos los años tienen 365 días y cada mes tiene
30 días.
- Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una
excepción.
- Apartado extra: Crea una excepción propia que salte cuando sea la fecha de tu nacimiento.
 */

public class EjercicioB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		try {

			System.out.println("Bienvenido al restador de fechas. El formato de una fecha es: dd/MM/yyyy");
			System.out.print("\nEscriba la primera fecha: ");
			String fecha1 = s.next();
			ExcepcionesPropias.miCumple(fecha1);
			System.out.print("Escriba la segunda fecha: ");
			String fecha2 = s.next();
			ExcepcionesPropias.miCumple(fecha2);

			System.out.print("¿Cuál de las 2 fechas será la primera? (Elija 1 o 2): ");
			int opcion = s.nextInt();

			if (opcion == 2) {
				String aux = fecha1;
				fecha1 = fecha2;
				fecha2 = aux;
			}

			System.out.println("La primera fecha es entonces:  " + fecha1);
			System.out.println("La segunda fecha es entonces:  " + fecha2);

			if (FuncionesApartado1.restadorFechas(fecha1, fecha2) != 0) {

				System.out.println("\nLa diferencia de días es: " + FuncionesApartado1.restadorFechas(fecha1, fecha2));
			}

		} catch (ExcepcionesPropias e) {
			System.out.println("\nSe ha producido el siguiente error: " + e.getMessage());
			

		}

		s.close();
	}

}
