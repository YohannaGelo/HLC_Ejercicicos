package Apartado1claseString;

public class FuncionesApartado1_claseString {

	// Función apartado A
	public static String sinCaracteresRepetidas(String str1, String str2) {

		String out1 = "";
		String out2 = "";

		char[] arrayOut1 = str1.toCharArray();
		char[] arrayOut2 = str2.toCharArray();

		boolean imprimir1 = false;
		boolean imprimir2 = false;

		// out1 contendrá todos los caracteres presentes en la str1 pero NO estén
		// presentes en str2.
		for (int i = 0; i < arrayOut1.length; i++) {
			for (int j = 0; j < arrayOut2.length; j++) {

				if (arrayOut1[i] != arrayOut2[j]) { // si el caracter de str1 es distinto al de str2 se imprimirá
					imprimir1 = true;

				} else { // si son iguales no se imprime y saltamos al siguiente
					imprimir1 = false;
					j = arrayOut2.length;
				}

			}
			if (imprimir1) { // si hay que imprimir se añade a la cadena que sacará la función
				out1 = out1 + arrayOut1[i];
				imprimir1 = false;
			}

		}

		// out2 contendrá todos los caracteres presentes en la str2 pero NO estén
		// presentes en str1.
		for (int i = 0; i < arrayOut2.length; i++) {
			for (int j = 0; j < arrayOut1.length; j++) {

				if (arrayOut2[i] != arrayOut1[j]) { // si el caracter de str2 es distinto al de str1 se imprimirá
					imprimir2 = true;

				} else { // si son iguales no se imprime y saltamos al siguiente
					imprimir2 = false;
					j = arrayOut1.length;
				}

			}
			if (imprimir2) { // si hay que imprimir se añade a la cadena que sacará la función
				out2 = out2 + arrayOut2[i];
				imprimir2 = false;
			}

		}

		return "out1=" + out1 + "\tout2=" + out2;

	}
	
	// Función apartado B
	public static int restadorFechas(String fecha1, String fecha2) {
		
		// Tomo las fechas, las separo por la / y casteo a entero
		try {
		
		String[] digitos1 = fecha1.split("/");
		int dia1 = Integer.parseInt(digitos1[0]);
		int mes1 = Integer.parseInt(digitos1[1]);
		int anio1 = Integer.parseInt(digitos1[2]);
		
		String[] digitos2 = fecha2.split("\\/");
		int dia2 = Integer.parseInt(digitos2[0]);
		int mes2 = Integer.parseInt(digitos2[1]);
		int anio2 = Integer.parseInt(digitos2[2]);
		
		// Calculo los días totales de cada fecha
        int totalDias1 = (anio1 * 365) + (mes1 * 30) + dia1;
        int totalDias2 = (anio2 * 365) + (mes2 * 30) + dia2;

        // Diferencia absoluta
        return Math.abs(totalDias1 - totalDias2);
        
		} catch (NumberFormatException e) {
			// throw new NumberFormatException("Una de las fechas tiene un formato incorrecto.");
			System.out.println("\nSe ha producido el siguiente error: " + e.getMessage());
			System.out.println("Formato de fechas incorrectas. Cerrando la aplicación.");
			
	    }
		return 0; 
		
	}
	

	
	
	

}
