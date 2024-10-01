package Apartado3POO;

/*
 Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y
cantidad (La cual puede tener decimales).
 El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo
anterior.
 Crea sus métodos get, set y toString. Tendrá dos métodos especiales:
	● ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
	introducida es negativa, no se hará nada.
	● retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad
	actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */

public class EjercicioA_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta("Pepito Perez", 1500.50);
		
		System.out.println(cuenta.toString());
		
		cuenta.ingresar(250);
		
		System.out.println("");
		System.out.println(cuenta.toString());
		
		cuenta.retirar(2050);
		System.out.println("");
		System.out.println(cuenta.toString());
		

	}

}
