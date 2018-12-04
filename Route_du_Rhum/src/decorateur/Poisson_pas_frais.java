package decorateur;

import strategie.Voilier;

public class Poisson_pas_frais extends ArmementSupplementaire{

	private Voilier voilier;
	public Poisson_pas_frais(Voilier voilier) {
		super(voilier);
	}
	
	public void appliqueSuivreRoute(){
		super.getVoilier().appliqueSuivreRoute();
	}
	
	public String toString(){
		return super.toString() + "-poissons pas frais";
	}

}
