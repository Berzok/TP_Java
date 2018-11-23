package decorateur;

import Strategie.SuivreRoute;
import Strategie.Voilier;

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
