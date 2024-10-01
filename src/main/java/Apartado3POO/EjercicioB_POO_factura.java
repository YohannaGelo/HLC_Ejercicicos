package Apartado3POO;

/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. 
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas 
facturas se emitieron de más de 600 €.
*/

public class EjercicioB_POO_factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura f1 = new Factura(001, 5, 3);
		Factura f2 = new Factura(002, 15, 0.75);
		Factura f3 = new Factura(003, 8, 90);
		Factura f4 = new Factura(004, 20, 1);
		Factura f5 = new Factura(005, 9, 120);
		
		System.out.println("Información de todos los artículos: ");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println(f5.toString());
		
		System.out.println("\nTotal facturado: ");
		System.out.println(Factura.getTotal());
		
		System.out.println("\nLitros de la fatura 1: ");
		System.out.println(f1.getLitros());
		
		System.out.println("\nArticulos con facturas superiores a 600 Euros: ");
		System.out.println(Factura.getMas600());
		
	}

}
