package Apartado5Interface;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ejercicio_Productos {

	public static void main(String[] args) {

		// Rellenar array alimentos
		ArrayList<Alimento> productosAlimenticios = new ArrayList<>();
		productosAlimenticios.add(new Cereales("Oatmeal", TipoCereal.avena, 3, LocalDate.of(2025, 11, 3)));
		productosAlimenticios.add(new Cereales("Fitness fiber", TipoCereal.trigo, 2.25, LocalDate.of(2025, 04, 20)));
		productosAlimenticios.add(new Vino("MarcaVino1", "tinto", 12, 8, 700, TipoEnvase.Botella_de_cristal, LocalDate.of(2025, 07, 01), 5));
		productosAlimenticios.add(new Vino("MarcaVino2", "rosado", 6, 5.3, 330, TipoEnvase.Botella_de_cristal, LocalDate.of(2025, 03, 03), 5));

		// Rellenar array líquidos
		ArrayList<Detergente> productosLiquidos = new ArrayList<>();
		productosLiquidos.add(new Detergente("Agerul", 6, 5000, TipoEnvase.Botella_de_plastico_grande, 20));
		productosLiquidos.add(new Detergente("Dixan", 4, 2500, TipoEnvase.Botella_de_plastico_mediana, 10));
		productosLiquidos.add(new Detergente("Norit", 1.25, 500, TipoEnvase.Botella_de_plastico_pequeña, 2));
		
		// Recorro los array y muestro los resultados obtenidos
		System.out.println("Listado Alimentos:");
		for (Alimento alimento : productosAlimenticios) {
			System.out.println(alimento.toString());
		}
		System.out.printf("Total Calorias: %.0f", Alimento.getTotalCalorias());
		
		
		System.out.println("\n\nListado Líquidos:");
		for (Detergente detergente : productosLiquidos) {
			System.out.println(detergente.toString());
		}
		System.out.printf("Total Descuentos:  %.0f%%",Detergente.getTotalDescuento());
		System.out.println("\nDinero Ahorrado: " + Detergente.getDineroAhorrado() + " euros");
		
	}

}
