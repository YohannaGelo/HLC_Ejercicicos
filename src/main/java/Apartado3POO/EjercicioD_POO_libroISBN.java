package Apartado3POO;

import java.util.ArrayList;


public class EjercicioD_POO_libroISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo el arrayList
        ArrayList<Libro> libros = new ArrayList<Libro>();
        
        
        libros.add(new Libro("ESN1542LO", "El Señor de los Anillos", "JR Tolkien", 450));
        libros.add(new Libro("UYT5846NA", "Orgullo y Prejuicio", " Jane Austen", 650));


        // Imprimir todos los libros
        Libro masLargo = new Libro("", "", "", 0);
		System.out.println("Información de todos los libros: ");
		
		// Recorre los libros y va guardando el que tiene más páginas
		for (Libro l : libros) {
			System.out.println(l.toString());
			
			if (l.getNumPagina() > masLargo.getNumPagina()) {
				masLargo = l;
			}
			
		}
		
		System.out.println("\nLibro con más páginas: ");
		System.out.println(masLargo.toString());
		
		
		
	}

}
