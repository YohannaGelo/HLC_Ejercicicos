package Apartado1claseString;

public class ExcepcionesPropias_claseString extends Exception {
	
	/**
	 * No sé para que sirve, pero me saltaba una advertencia
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionesPropias_claseString(String msg) {
        super(msg);
    }
	
	//Controla si la fecha coincide con mi cumple
    public static void miCumple(String fecha) throws ExcepcionesPropias_claseString {

        if (fecha.equals("13/02/1984")) {
            throw new ExcepcionesPropias_claseString("\nEsta fecha no es válida porque es MI CUMPLEAÑOS.");
        }
    }


}

