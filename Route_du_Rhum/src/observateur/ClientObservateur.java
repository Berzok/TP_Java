package observateur;

import java.io.File;
import java.util.Set;

import outils.LectureFichierXML;

public class ClientObservateur {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		
		Classements leRhum = new Classements();
		Abandons abandonsRhum = new Abandons();
		
		leRhum.enregistrer(abandonsRhum);
		
		File[] filesXML = new File("data_2018").listFiles();
		
		for(File leFichier : filesXML){
			Set lesPositions = LectureFichierXML.lecture(leFichier);
			leRhum.ajoutClassement(lesPositions);
//			System.out.println(lesPositions.size() + " " + lesPositions);
		}
	System.out.println("" + leRhum.listeObservateurs.get(leRhum.listeObservateurs.size()-1).toString());
	}

}
