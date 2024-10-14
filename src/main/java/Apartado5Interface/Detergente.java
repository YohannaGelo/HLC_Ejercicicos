package Apartado5Interface;


public class Detergente implements ConDescuento {
	
	private static double totalDescuento = 0;
	private static double dineroAhorrado = 0;

	// ATRIBUTOS
	private String marca;
	private double precio;
	private double volumen;
	private TipoEnvase tipoEnvase;
	private double descuento;
	private double precioDescuento;
	

	// CONSTRUCTOR
	public Detergente(String marca, double precio, double volumen, TipoEnvase tipoEnvase, double descuento) {
		this.marca = marca;
		this.precio = precio;
		this.volumen = volumen;
		this.tipoEnvase = tipoEnvase;
		this.descuento = descuento;
		
		this.precioDescuento = precio - (precio*(descuento/100));
		
		totalDescuento += descuento;
		dineroAhorrado += (precio-this.precioDescuento);
		
	}
	
	
	// ToSTRING y GETTERs / SETTERs
	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", volumen=" + volumen + ", tipoEnvase="
				+ tipoEnvase + ", descuento=" + descuento + ", precioDescuento=" + precioDescuento + "]";
	}
	
	

	public static double getTotalDescuento() {
		return totalDescuento;
	}


	public static double getDineroAhorrado() {
		return dineroAhorrado;
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


	public TipoEnvase getTipoEnvase() {
		return tipoEnvase;
	}


	public void setTipoEnvase(TipoEnvase tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}


	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public double getPrecioDescuento() {
		return precioDescuento;
	}


	public void setPrecioDescuento(double precioDescuento) {
		this.precioDescuento = precioDescuento;
	}
	

	
	

}
