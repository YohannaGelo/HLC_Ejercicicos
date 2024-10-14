package Apartado5Interface;

import java.time.LocalDate;

public abstract class Alimento {
	
	// ATRIBUTOS
	protected static double totalCalorias;
	
	protected String marca;
	protected double precio;
	protected LocalDate caducidad;
	protected int calorias;
	
	// CONSTRUCTOR
	public Alimento(String marca, double precio, LocalDate caducidad) {
		this.marca = marca;
		this.precio = precio;
		this.caducidad = caducidad;
		
	}

	// GETTERs y SETTERs
	public static double getTotalCalorias() {
		return totalCalorias;
	}



	public static void setTotalCalorias(double totalCalorias) {
		Alimento.totalCalorias = totalCalorias;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public LocalDate getCaducidad() {
		return caducidad;
	}



	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}



	public int getCalorias() {
		return calorias;
	}



	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	

	
	
	
	
	
	

}
