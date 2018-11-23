package observateur;

import java.util.GregorianCalendar;

public class Position {
	String nom, skipper;
	double distance;
	boolean abandon;
	GregorianCalendar dateEtHeure;

	
	public Position(String n2, String s2, double d2, GregorianCalendar dh2, boolean abd) {
		nom = n2;
		skipper = s2;
		distance = d2;
		dateEtHeure = dh2;
		abandon = abd;
	}

	public String getNom(){
		return nom;
	}
	public String getSkipper(){
		return skipper;
	}
	public boolean getAbandon(){
		return abandon;
	}
	
}
