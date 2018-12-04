package observateur;

import java.util.TreeSet;
import java.util.Set;

public class Arrivees implements Observateur{
	
	TreeSet <Position> listeArrivees;
	
	public Arrivees(){
		listeArrivees = new TreeSet<Position>();
	}

	@Override
	public void actualiser(Observable o) {
		Set <Position> ensemble = ((Classements) o).getDernierClassement();
		for(Position pos : ensemble){
			if(pos.getDate() != null){
				listeArrivees.add(pos);
			}
		}
	}
	
	public TreeSet<Position> getAbandons(){
		return listeArrivees;
	}
	
	public void afficher(){
		Integer compteur = 1;
		for(Position pos : listeArrivees){
			System.out.println("["+compteur+"]: " + pos.getNom());
			System.out.println("        " + pos.getSkipper());
			System.out.println("");
			compteur++;
		}
	}

}
