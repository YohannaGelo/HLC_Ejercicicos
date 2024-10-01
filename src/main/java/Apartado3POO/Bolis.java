package Apartado3POO;

import java.util.Objects;

public class Bolis implements Comparable<Bolis>{
	
	 
    //ATRIBUTOS
    private String brand;
    private String model;
    private double price;
    
    
    //CONSTRUCTOR
    public Bolis(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    
    //ToSTRING y GETTER / SETTER
    @Override
    public String toString() {
        return brand + "\t" + model + "\t" + price + " Euros";
    }
    
    
    //M�TODOS
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.brand);
        hash = 97 * hash + Objects.hashCode(this.model);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final Bolis other = (Bolis) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }
    
    
    public int compareTo(Bolis otherBoli) {
  
        ////Para ordenar por marca

            return this.brand.compareTo(otherBoli.brand);
    }  

}
