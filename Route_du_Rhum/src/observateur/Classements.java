package observateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Classements implements Observable{
	
	List <Set <Position>> listeClassements;
	List <Observateur> listeObservateurs;
	
	public Classements(){
		listeClassements = new ArrayList<Set <Position>>();
		listeObservateurs = new ArrayList<Observateur>();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ajoutClassement(Set leSet){
		listeClassements.add(leSet);
		
		this.informerObservateurs();
	}
	
	@Override
	public void enregistrer(Observateur obs) {
		listeObservateurs.add(obs);
	}

	@Override
	public void oublier(Observateur obs) {
		listeObservateurs.remove(obs);
	}

	@Override
	public void informerObservateurs() {
		for(int j=0; j<listeObservateurs.size(); j++){
			listeObservateurs.get(j).actualiser(this);
		}
	}

	public Set<Position> getDernierClassement(){
		return this.listeClassements.get(listeClassements.size()-1);
	}
	
	public String toString(){
		return listeClassements.toString();
	}

}
