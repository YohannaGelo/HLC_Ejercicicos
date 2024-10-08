package Apartado4EstrucDinamica;

import java.util.ArrayList;

public class EjercicioB_F_usoMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> color = new ArrayList<>();
        color.add("azul");
        color.add("rojo");
        color.add("verde");
        color.add("amarillo");
        color.add("negro");
        System.out.println("ArrayList (color) Original: " + color);
        
        
        
		// Ejercicio b) Escriba un programa Java para vaciar un ArrayList. 
        ArrayList<String> colorVacio = new ArrayList<>(color);
		colorVacio.clear();
		System.out.println("\n");
		
		
		// Ejercicio c) Escriba un programa Java para probar si un ArrayList está vacío o no.
		System.out.println((colorVacio.isEmpty()) ? "ArrayList (colorVacio) está vacío" : "ArrayList (colorVacio) está lleno");
		System.out.println((color.isEmpty()) ? "ArrayList (color) está vacío" : "ArrayList (color) está lleno");
		System.out.println("\n");
		
		
		/* 
		Ejercicio d) Escriba un programa Java para recortar la capacidad de un ArrayList al tamaño actual de la lista. Usa el método trimToSize, 
		para ello revisa la API de Java de la clase ArrayList: https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/util/ArrayList.html 
		*/
		ArrayList<String> colorRecorte = new ArrayList<>(color);
		colorRecorte.trimToSize();	// Se ajusta el tamaño. Por defecto Java tiene preparado 1,5 la capacidad actual
		System.out.println("ArrayList (colorRecorte): " + colorRecorte);
		System.out.println("\n");
		
		
		
		// Ejercicio e) Escriba un programa Java para reemplazar el segundo elemento de una ArrayList con el elemento especificado. 
		ArrayList<String> colorReemplazar = new ArrayList<>(color);
		
		String nuevoColor = "naranja";
		
		colorReemplazar.set(1, nuevoColor);	
		System.out.println("ArrayList (colorReemplazar): " + colorReemplazar);
		System.out.println("\n");
		

		
		
		// Ejercicio f) Escriba un programa Java para imprimir todos los elementos de una ArrayList utilizando la posición de los elementos.
		for (int i = 0; i < color.size(); i++) {
			System.out.println(i + ": " + color.get(i));
		}
		
		
	}

}
