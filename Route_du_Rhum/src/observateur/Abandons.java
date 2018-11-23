package observateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Abandons implements Observateur{
	
	List <String> listeAbandons = new ArrayList<String>();
	
	public Abandons(){

	}

	@Override
	public void actualiser(Observable o) {
		Set <Position> ensemble = ((Classements) o).getDernierClassement();
		for(Position pos : ensemble){
			if(pos.getAbandon()){
				if(!(listeAbandons.contains(pos))){
					listeAbandons.add(pos.getSkipper());
				}
			}
		}		
	}
	
	public List <String>getAbandons(){
		return listeAbandons;
	}
	
	public String toString(){
		String leString = "";
		for(String s : listeAbandons){
			leString = (s + "\n");
		}
		return leString;
	}

}
