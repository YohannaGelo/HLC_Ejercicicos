package Apartado3POO;

import java.util.Objects;

/*
 * Crear una clase Libro que contenga los siguientes atributos: ● ISBN ●  Titulo ●  Autor ●  Número de páginas
 */

public class Libro {

	// ATRIBUTOS
	private String isbn;
	private String titulo;
	private String autor;
	private int numPagina;
	
	
	// CONSTRUCTOR
	public Libro(String isbn, String titulo, String autor, int numPagina) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPagina = numPagina;
	}


	// ToString
	@Override
	public String toString() {
		return "«El libro " + titulo + " con " + isbn + " creado por el " + autor + " tiene " + numPagina + " páginas»";
	}

	
	//GETTERs / SETTERs
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getNumPagina() {
		return numPagina;
	}


	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}


	// Comparar objetos
	@Override
	public int hashCode() {
		return Objects.hash(numPagina);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return numPagina == other.numPagina;
	}
	
	
	
	
	
	
	
}
