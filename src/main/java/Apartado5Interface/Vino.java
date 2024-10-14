package Apartado5Interface;

import java.time.LocalDate;

public class Vino extends Alimento implements EsAlimento {

	// ATRIBUTOS
	private String tipoVino;
	private double grados;
	private double volumen;
	private TipoEnvase tipoEnvase;
	private double descuento;
	private double precioDescuento;

	// CONSTRUCTOR
	public Vino(String marca, String tipoVino, double grados, double precio, double volumen, TipoEnvase tipoEnvase,
			LocalDate caducidad, double descuento) {
		super(marca, precio, caducidad);
		this.tipoVino = tipoVino;
		this.grados = grados;
		this.volumen = volumen;
		this.tipoEnvase = tipoEnvase;
		this.descuento = descuento;

		// Cálculo descuento y las calorias
		this.precioDescuento = precio - (precio * (descuento / 100));
		this.calorias = (int) grados * 10;

		totalCalorias += this.calorias;
	}


	// ToSTRING
	@Override
	public String toString() {
		return "Vino [marca=" + marca + ", tipoVino=" + tipoVino + ", grados=" + grados + ", precio=" + precio
				+ ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + ", caducidad=" + caducidad + ", descuento="
				+ descuento + ", precioDescuento=" + precioDescuento + ", calorias=" + calorias + "]";
	}

	// GETTERs y SETTERs
	public String getTipoVino() {
		return tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
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
