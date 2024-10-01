package Apartado3POO;

/*
Igual que el ejercicio b) pero suponiendo que no se introduce el precio por litro. 
Solo existen tres productos con precios: 1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
 */

public class Factura2 {

	// ATRIBUTOS
	private int codigo;
	private int litros;
	private Precio precioLitro;
	private double precioArticulo;

	private static double total = 0;
	private static int mas600 = 0;

	// CONSTRUCTOR
	public Factura2(int codigo, int litros, Precio precioLitro) {
		super();
		this.codigo = codigo;
		this.litros = litros;
		this.precioLitro = precioLitro;

		switch (this.precioLitro.ordinal()) {	// Accedo a la posición del enum y puedo asignar su valor
		case 0:
			this.precioArticulo = 0.6;
			break;
		case 1:
			this.precioArticulo = 3;
			break;
		case 2:
			this.precioArticulo = 1.25;
			break;

		default:
			break;
		}

		this.calcularPrecio();

	}

	// ToSTRING y GETTERS / SETTERS
	@Override
	public String toString() {
		return "Factura [codigo=" + codigo + ", litros=" + litros + ", precioLitro=" + precioLitro + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public Precio getPrecio() {
		return precioLitro;
	}

	public void setPrecio(Precio precioLitro) {
		this.precioLitro = precioLitro;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		Factura2.total = total;
	}

	public static int getMas600() {
		return mas600;
	}

	public static void setMas600(int mas600) {
		Factura2.mas600 = mas600;
	}

	// MÉTODOS
	public void calcularPrecio() {

//		double precio = 0;
//		
//		switch (this.precioLitro.ordinal()) {	// Accedo a la posición del enum y puedo asignar su valor
//		case 0:
//			this.precioArticulo = 0.6;
//			break;
//		case 1:
//			this.precioArticulo = 3;
//			break;
//		case 2:
//			this.precioArticulo = 1.25;
//			break;
//
//		default:
//			break;
//		}

		double precioArticuloTotal = precioArticulo * this.litros;

		total += precioArticuloTotal;

		if (precioArticuloTotal > 600) {
			mas600 += 1;
		}
	}

}
