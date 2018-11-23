package client;

import decorateur.CanonOrbital;
import decorateur.Poisson_pas_frais;
import Strategie.Multicoque;
import Strategie.RouteDeLaSoie;
import Strategie.RouteDesAlizes;
import Strategie.Voilier;

public class Cliente {

	public static void main(String[] args) {
		Voilier leVoilier = new Multicoque("Staphylo", new RouteDeLaSoie());
		System.out.println(leVoilier);
		leVoilier.appliqueSuivreRoute();
		leVoilier.setRoute(new RouteDesAlizes());
		leVoilier.appliqueSuivreRoute();
		
//		leVoilier = new CanonOrbital(leVoilier);
//		System.out.println("");
//		System.out.println(leVoilier.toString());
//		leVoilier = new Poisson_pas_frais(leVoilier);
//		System.out.println(leVoilier.toString());
//		leVoilier.setRoute(new RouteDeLaSoie());
//		leVoilier.appliqueSuivreRoute();
		
		
		Voilier lePalanquin = new Multicoque("Palanquin");
		lePalanquin.setRoute(new RouteDeLaSoie());
		lePalanquin.appliqueSuivreRoute();
		lePalanquin = new CanonOrbital(lePalanquin);
		lePalanquin = new Poisson_pas_frais(lePalanquin);
		System.out.println(lePalanquin.toString() + "\n");
		lePalanquin.appliqueSuivreRoute();
		
		
		}

}
