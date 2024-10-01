package Apartado3POO;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashSet;

public class EjercicioE_POO_moviles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("MOVIL - ORDENACI�N PRECIO\n");
        System.out.print("-------------------------\n");

        //INSTANCIAR
        //Creo el arrayList
        ArrayList<Movil> moviles = new ArrayList<>();
        
        //Asigno valores
        moviles.add(new Movil("Iphone", "12 Pro Max", 1259));
        moviles.add(new Movil("Xiaomi", "Mi 10 Pro", 999));
        moviles.add(new Movil("Huawei", "P40 Pro+", 1399));
        moviles.add(new Movil("Samsung", "Z Flip 5G", 1550));
        moviles.add(new Movil("Samsung", "S20", 1500));
        moviles.add(new Movil("LG", "V50", 899));
        moviles.add(new Movil("Xiami", "Mi 10 Pro", 999));
        moviles.add(new Movil("Huawei", "P40 Pro+", 1399));
        moviles.add(new Movil("Samsung", "Z Flip 5G", 1550));
        moviles.add(new Movil("Samsung", "S30", 1300));
        moviles.add(new Movil("Huawei", "P50 Pro+", 1399));
        moviles.add(new Movil("Samsung", "Z Flip 5G", 1550));
        
        
        System.out.println("\nORIGINAL\n");
        for (Movil movile : moviles) {
            System.out.println(movile);
        }
        
        Collections.sort(moviles);
        
        System.out.println("\n\nORDENADO\n");
        for (Movil movile : moviles) {
            System.out.println(movile);
        }
        
        //HashSet<Movil> movilesHash = new HashSet<>(moviles);
//        HashSet movilesHash = new HashSet(moviles);
//        
//        System.out.println("\n\nSIN REPETICIONES\n");
//        for (Object movil : movilesHash) {
//            System.out.println(movil);
//        }
        

	}

}
