package lepackage;

public class CanonOrbital extends ArmementSupplementaire
	{
			
	public CanonOrbital(Voilier leVoilier) {
		super(leVoilier);
	}

	public String toString(){
		return "" + bateau.chNom + ", arm� d'un canon orbital.";
	}
}
