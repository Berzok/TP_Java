package decorateur;

import strategie.SuivreRoute;
import strategie.Voilier;

public abstract class ArmementSupplementaire extends Voilier
	{
	private Voilier bateau;
	
	public ArmementSupplementaire(Voilier voilier)
		{
		bateau = voilier;
		}
	
	public void appliqueSuivreRoute(){
		super.appliqueSuivreRoute();
	}
	
	public SuivreRoute getRoute(){
		return bateau.getRoute();
	}
	
	public Voilier getVoilier(){
		return this.bateau;
	}
	
	public String toString(){
		return bateau.toString();
	}
}
