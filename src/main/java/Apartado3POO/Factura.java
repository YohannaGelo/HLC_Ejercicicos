package Apartado3POO;

/*
 Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
 En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. 
 Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas 
 facturas se emitieron de más de 600 €.
 */

public class Factura {

	// ATRIBUTOS
	private int codigo;
	private int litros;
	private double precio;

	private static double total = 0;
	private static int mas600 = 0;

	// CONSTRUCTOR
	public Factura(int codigo, int litros, double precio) {
		super();
		this.codigo = codigo;
		this.litros = litros;
		this.precio = precio;

		this.calcularPrecio();

	}

	// ToSTRING y GETTERS / SETTERS
	@Override
	public String toString() {
		return "Factura [codigo=" + codigo + ", litros=" + litros + ", precio=" + precio + "]";
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		Factura.total = total;
	}

	public static int getMas600() {
		return mas600;
	}

	public static void setMas600(int mas600) {
		Factura.mas600 = mas600;
	}

	// MÉTODOS
	public void calcularPrecio() {

		double precioArticulo = this.precio*this.litros;
		
		total += precioArticulo;

		if (precioArticulo > 600) {
			mas600 += 1;
		}
	}


}
