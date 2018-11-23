package decorateur;

import Strategie.Voilier;

public class CanonOrbital extends ArmementSupplementaire
	{
			
	public CanonOrbital(Voilier leVoilier) {
		super(leVoilier);
	}
	
	public void appliqueSuivreRoute(){
		super.getVoilier().appliqueSuivreRoute();
	}

	public String toString(){
		return super.toString() + "-canon orbital\n";
	}
}
