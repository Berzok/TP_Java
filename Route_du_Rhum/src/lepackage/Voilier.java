package lepackage;

public abstract class Voilier
	{
	String chNom;
	SuivreRoute suivreRoute;
	
	public Voilier(String leNom, SuivreRoute laRoute){
		this.chNom = leNom;
		this.suivreRoute = laRoute;
		}
	
	public void appliqueSuivreRoute(){
		this.suivreRoute.suivreRoute();
		}
	
	
	public void setRoute(SuivreRoute laRoute){
		this.suivreRoute = laRoute;
		}
	
	public String toString(){
		return "" + this.chNom;
		}
	}
