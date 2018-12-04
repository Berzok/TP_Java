package observateur;

import java.util.HashSet;
import java.util.Set;

public class Abandons implements Observateur{
	
	HashSet <String> listeAbandons;
	
	public Abandons(){
		listeAbandons = new HashSet<String>();
	}

	@Override
	public void actualiser(Observable o) {
		Set <Position> ensemble = ((Classements) o).getDernierClassement();
		for(Position pos : ensemble){
			if(pos.getAbandon()){
				listeAbandons.add(pos.getSkipper());
			}
		}		
	}
	
	public HashSet<String> getAbandons(){
		return listeAbandons;
	}
	
	public String toString(){
		return listeAbandons.toString();
	}

}
