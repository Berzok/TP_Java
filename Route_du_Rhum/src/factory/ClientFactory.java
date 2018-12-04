package factory;
import java.io.File;
import java.util.List;
import java.util.Set;

import outils.LectureFichierXML;
import outils.LectureFichierXML_aCompleter;
import strategie.Voilier;

public class ClientFactory{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		
		List liste = LectureFichierXML_aCompleter.lectureVoiliers(new File("voiliers.xml"));
		System.out.println(liste);
	}

}
