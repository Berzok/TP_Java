package lepackage;

public class Cliente {

	public static void main(String[] args) {
		Voilier leVoilier = new Multicoque("Staphylo", new RouteDeLaSoie());
		System.out.println(leVoilier);
		leVoilier.appliqueSuivreRoute();
		leVoilier.setRoute(new RouteDesAlizes());
		leVoilier.appliqueSuivreRoute();
		
		leVoilier = new CanonOrbital(leVoilier);
		System.out.println("");
		System.out.println(leVoilier.toString());
		leVoilier = new Poisson_pas_frais(leVoilier);
		System.out.println(leVoilier.toString());
		}

}
