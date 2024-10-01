package Apartado3POO;

/*
Igual que el ejercicio b) pero suponiendo que no se introduce el precio por litro. 
Solo existen tres productos con precios: 1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
*/

public class EjercicioC_POO_factura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura2 f1 = new Factura2(001, 250, Precio.precio2); // 750
		Factura2 f2 = new Factura2(002, 15, Precio.precio1);  // 9
		Factura2 f3 = new Factura2(003, 300, Precio.precio3);  // 375
	
		System.out.println("Información de todos los artículos: ");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

		
		System.out.println("\nTotal facturado: ");
		System.out.println(Factura2.getTotal());
		
		System.out.println("\nLitros de la fatura 1: ");
		System.out.println(f1.getLitros());
		
		System.out.println("\nArticulos con facturas superiores a 600 Euros: ");
		System.out.println(Factura2.getMas600());
		
	}

}
