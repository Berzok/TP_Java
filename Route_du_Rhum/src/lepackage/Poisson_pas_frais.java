package lepackage;

public class Poisson_pas_frais extends ArmementSupplementaire{

	public Poisson_pas_frais(Voilier voilier) {
		super(voilier);
	}
	
	public String toString(){
		return "" + bateau.chNom + ", arm� de poissons pas frais.";
	}

}
