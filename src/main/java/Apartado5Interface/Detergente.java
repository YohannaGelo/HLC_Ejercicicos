package Apartado5Interface;

public class Detergente implements ConDescuento {

	// ATRIBUTOS
	private String marca;
	private double precio;
	private double volumen;

	// CONSTRUCTOR
	public Detergente(String marca, double precio, double volumen) {
		this.marca = marca;
		this.precio = precio;
		this.volumen = volumen;
	}

	// ToSTRING y GETTERs / SETTERs
	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", volumen=" + volumen + "]";
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

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	// MÉTODOS
	@Override
	public void setDescuento(double des) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

}
