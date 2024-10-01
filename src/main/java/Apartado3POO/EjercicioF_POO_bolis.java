package Apartado3POO;

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioF_POO_bolis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.print("COMPARA Y ORDENA\n");
	        System.out.print("----------------\n");

	        //INSTANCIAR
	        //Creo el arrayList
	        ArrayList<Bolis> pens = new ArrayList<>();
	        
	        
	        pens.add(new Bolis("Pilot", "SuperGrip", 1));
	        pens.add(new Bolis("Pilot", "G2       ", 1.3));
	        pens.add(new Bolis("Bic", "Cristal   ", 0.5));
	        pens.add(new Bolis("Pilot", "G2       ", 1.3));
	        
	        
	        //muestro el original
	        System.out.println("\nORIGINAL\n");
	        for (int i = 0; i < pens.size(); i++) {
	            System.out.println("Boli " + (i+1) + ":\t  " + pens.get(i));
	        }
	        
	        
	        //comparo el 1 con el 2
	        boolean equals = pens.get(0).equals(pens.get(1));
	        System.out.println("\nEl boli 1 y el boli 2 son iguales?");
	        
	        if (equals) {
	            System.out.println("Sí, son iguales");
	        } else {
	            System.out.println("No, son diferentes");
	        }
	        
	        //comparo el 3 con el 4
//	        equals = pens.get(1).equals(pens.get(3));
//	        System.out.println("\n�El boli 2 y el boli 4 son iguales?");
//	        
//	        if (equals) {
//	            System.out.println("S�, son iguales");
//	        } else {
//	            System.out.println("No, son diferentes");
//	        }
//	        
	        
	        //ordenar por marca
	        Collections.sort(pens);
	        
	        
	        //muestro ordenado
	        System.out.println("\n\nORDENADO\n");
	        for (int i = 0; i < pens.size(); i++) {
	            System.out.println("Boli " + (i+1) + ":\t  " + pens.get(i));
	        }
		
	}

}
