package Apartado3POO;

import java.util.Objects;

public class Movil implements Comparable<Movil> {
	
	//ATRIBUTOS
    private String brand;
    private String model;
    private int price;
    
    //CONSTRUCTOR
    public Movil(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    
    //ToSTRING y GETTER / SETTER
    @Override
    public String toString() {
        //return brand + " " + model + "\t\t(" + price + " euros )";
        return  "(" + price + " euros )\t" + brand + " " + model;
    }
    
    
    //METODOS
    @Override
    public int compareTo(Movil otherMovil) {
        ////Para ordenar solo por precio
        //return this.price - otherMovil.price;
        
        ////Para ordenar por precio y marca
        if (this.price - otherMovil.price == 0) {
            return this.brand.compareTo(otherMovil.brand);
        
        } else {    //si son del mismo PRECIO, ordena por MARCA
            
            return this.price - otherMovil.price;
        }
        
    }  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.brand);
        hash = 79 * hash + Objects.hashCode(this.model);
        hash = 79 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movil other = (Movil) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }
    

}
