package lepackage;

public class Cliente {

	public static void main(String[] args) {
		Voilier leVoilier = new Multicoque("Staphylo", new RouteDeLaSoie());
		System.out.println(leVoilier);
		leVoilier.appliqueSuivreRoute();
		leVoilier.setRoute(new RouteDesAlizes());
		leVoilier.appliqueSuivreRoute();
		
		}

}
