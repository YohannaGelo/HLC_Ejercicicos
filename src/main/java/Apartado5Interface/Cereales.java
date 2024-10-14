package Apartado5Interface;

import java.time.LocalDate;

public class Cereales extends Alimento implements EsAlimento {
	
	// ATRIBUTOS
	private TipoCereal tipoCereal;
	
	
	// CONSTRUCTOR
	public Cereales(String marca, TipoCereal tipoCereal, double precio, LocalDate caducidad) {
		super(marca, precio, caducidad);
		this.tipoCereal = tipoCereal;
		
		// Defino las calorias según el tipo de cereal
		switch (this.tipoCereal) {
			case avena:
				this.calorias = 5;
				break;
			case maiz:
				this.calorias = 8;
				break;
			case trigo:
				this.calorias = 12;
				break;
			default:
				this.calorias = 15;
				break;
				
		}
		
		totalCalorias += this.calorias;
	}
	
	

	// ToSTRING / GETTERs y SETTERs
	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", tipoCereal=" + tipoCereal + ", precio=" + precio + ", caducidad="
				+ caducidad + ", calorias=" + calorias + "]";
	}



	public TipoCereal getTipoCereal() {
		return tipoCereal;
	}


	public void setTipoCereal(TipoCereal tipoCereal) {
		this.tipoCereal = tipoCereal;
	}


	
	
	
	
	
	
}
