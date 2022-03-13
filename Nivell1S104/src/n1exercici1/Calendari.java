package n1exercici1;


public class Calendari {
	
	static String[] calendari = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol","Agost",
			"Septembre", "Octubre", "Novembre", "Desembre"};


	public static String[] getCalendari() {
		return calendari;
	}

	public void setCalendari(String[] calendari) {
		Calendari.calendari = calendari;
	}

}
