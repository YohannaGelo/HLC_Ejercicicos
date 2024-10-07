package Apartado3POO;

public class Persona {

	// ATRIBUTOS
	private final char SEXO_POR_DEFECTO = 'h';

	private String nombre = "";
	private int edad = 0;
	private char sexo = SEXO_POR_DEFECTO;
	private double peso = 0;
	private double altura = 0;
	private String dni;

	// CONSTRUCTOR
	// Un constructor por defecto.
	public Persona() {
		
		this.dni = this.generaDNI();
	}

	// Un constructor con el nombre, edad y sexo, el resto por defecto.
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = this.comprobarSexo(sexo);
		
		this.dni = this.generaDNI();
		
	}

	// Un constructor con todos los atributos como parámetro.
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = this.comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;

		this.dni = this.generaDNI();
	}

	// ToSTRING y GETTERS / SETTERS
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + ", dni=" + dni + "]";
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	
	
	

	// METODOS

	

	/*
	 * calculara si la persona esta en su peso ideal (peso en kg/(altura^2 en m)),
	 * si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si
	 * devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo
	 * de su peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25
	 * significa que tiene sobrepeso, la función devuelve un 1.
	 */
	public int calcularIMC() {

		double alturaM = this.altura/100;
		double imc = this.peso / (Math.pow(alturaM, 2));

		if (imc < 20) {
			return -1;
		} else if (imc > 20 && imc <= 25) {
			return 0;
		} else if (imc > 25 ){
			return 1;
		} else {
			return -5;
		}

	}
	
	
	

	// indica si es mayor de edad, devuelve un booleano.
	public boolean esMayorDeEdad() {
		
		if (this.edad > 17) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	 // comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior
	private char comprobarSexo (char sexo) {
		
		if (sexo == 'm') {
			return 'm';
		} else {
			return 'h';
		}
		
	}
		


	 /* genera un número aleatorio de 8 cifras, genera a partir de este su
	número su letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes
	dividir el método para que te sea más fácil. No será visible al exterior. */
	public String generaDNI() {
		
		String dni = "";
		
		int num = (int) (Math.random() * 90000000) + 10000000; 	// posibles valores desde el 10000000 al 99999999
		
		String letDni = "";
		
        int size = 23;
        String letter[] = {"T","R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        
        int rest = num%size;
        
        //recorro la matriz para buscar la letra
        for (int i = 0; i < letter.length; i++) {
            
            if (i == rest) {
                letDni = letter[i];
                dni = String.valueOf(num) + letDni;
                
            }
            
        }

		return dni;
		
	}

}
