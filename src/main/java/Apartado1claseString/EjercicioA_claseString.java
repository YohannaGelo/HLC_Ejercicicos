package Apartado1claseString;


/*
Ejercicio a) Crea una función que reciba dos cadenas como parámetro (str1, str2) e
imprima otras dos cadenas como salida (out1, out2).
 - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
Ejemplo: str1=aeiou r str2=eo z w out1=aiu out2=zw
 */

public class EjercicioA_claseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "aeiou r";
		String str2 = "eo z w";
		
		System.out.println(FuncionesApartado1_claseString.sinCaracteresRepetidas(str1, str2));
		
		
	}

}
