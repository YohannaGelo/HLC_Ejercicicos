package Apartado3POO;

import java.util.Scanner;

public class EjercicioG_POO_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("     PERSONAS");
		System.out.println("   +-----------+");

		System.out.print("\nIntroduce el nombre: ");
		String nombre = s.next();

		System.out.print("\nIntroduce la edad: ");
		int edad = s.nextInt();

		System.out.print("\nIntroduce el sexo (H / M): ");
		String sexoStr = s.next().toLowerCase();
		char sexo = sexoStr.charAt(0);

		System.out.print("\nIntroduce el peso: ");
		double peso = s.nextDouble();

		System.out.print("\nIntroduce la altura: ");
		double altura = s.nextDouble();
		
		System.out.println("\n  ~ Creando personas...");

		Persona[] personas = new Persona[3];

		// 3 objetos con los 3 constructores
		personas[0] = new Persona(nombre, edad, sexo, peso, altura);
		personas[1] = new Persona(nombre, edad, sexo);
		personas[2] = new Persona();

		// Configurar el último objeto
		personas[2].setEdad(29);
		personas[2].setNombre("Juan");
		personas[2].setSexo('h');
		personas[2].setPeso(79.5);
		personas[2].setAltura(182.3);
		
		System.out.println("\n   ~ Comprobación de pesos:");
		System.out.println("       ---------------------");

		// Comprobar pesos
		for (int i = 0; i < personas.length; i++) {
			int imc = personas[i].calcularIMC();

			if (imc == 0) {
				System.out.println(" · " + personas[i].getNombre() + " está en su peso ideal");
			} else if (imc == -1) {
				System.out.println(" · " + personas[i].getNombre() + " está por debajo de su peso ideal");
			} else if (imc == 1) {
				System.out.println(" · " + personas[i].getNombre() + " tiene sobrepeso");
			} else {
				System.out.println(" · " + personas[i].getNombre() + " no ha configurado el peso y/o la altura");
			}

		}
		
		System.out.println("\n   ~ Comprobación de edad:");
		System.out.println("       --------------------");

		// Comprobar si es mayor de edad
		for (int i = 0; i < personas.length; i++) {

			if (personas[i].esMayorDeEdad()) {
				System.out.println(" · " + personas[i].getNombre() + " sí es mayor de edad, tiene " + personas[i].getEdad());
			} else {
				System.out
						.println(" · " + personas[i].getNombre() + " aun no es mayor de edad, tiene " + personas[i].getEdad());
			}

		}
		
		// Ver objetos
		System.out.println("\n   ~ Resumen de todas las personas:");
		System.out.println("       -----------------------------");
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		
		
		s.close();

	}

}
