package outils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import factory.ClasseRhum;
import observateur.Position;
import strategie.Monocoque;
import strategie.Multicoque;
import strategie.Voilier;

public class LectureFichierXML_aCompleter {

	public static List lectureVoiliers (File adresse) {
		 
		 List listeVoiliers = new ArrayList();
		
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
	     DocumentBuilder builder = null;
	     
	     try {builder = builderFactory.newDocumentBuilder();
	         Document document = builder.parse(new FileInputStream(adresse));
	         NodeList listeElementClasses = document.getElementsByTagName("classe");
	        
	         for (int i=0 ; i < listeElementClasses.getLength() ; i++) {      
	        	 Element courant =  (Element) listeElementClasses.item(i);
	        	 String num  = courant.getAttribute("num");
	        	 int numeroClasse = Integer.parseInt(num)-1;
	        	 ClasseRhum classe = ClasseRhum.values()[numeroClasse];
	     
	        	 NodeList listeElementPosition = courant.getElementsByTagName("position");
	        	 for (int j=0 ; j < listeElementPosition.getLength() ; j++) {      
		        	 switch(classe){
		        	 case Ultime: case Multi50: case RhumMulti:
		        		 Voilier bateau = new Multicoque(courant.getNodeName(), classe);
		        	 }
	        		 
		        	 //
		        	 // partie � compl�ter pour 
	        		 // - instancier un voilier  monocoque ou multicoque 
	        		 // - le constructeur prend en param�tre : 
	        		 //			- le nom du voilier 
	        		 //			- la classe du voilier
	        		 //			
		             // - ajouter le voilier � la liste
		             //
			         //
			         //
	        		 //
	        		 //
		          }
                 
		     }
	         System.out.println(listeVoiliers);
		     return listeVoiliers;          
		     
	     } //try
	     catch (SAXException e) {e.printStackTrace();}
	     catch (IOException e) {e.printStackTrace();}
	     catch (ParserConfigurationException e) {e.printStackTrace();}
	     return null;
    }
	
	
	public static Set  lecturePositions (File adresse) {
		
	 Set hashSetPositions = new HashSet ();
	 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
     DocumentBuilder builder = null;
     try {builder = builderFactory.newDocumentBuilder();
         Document document = builder.parse(new FileInputStream(adresse));
         NodeList listeElementPosition = document.getElementsByTagName("position");
         for (int i=0 ; i < listeElementPosition.getLength() ; i++) {      
        	 Element courant =  (Element) listeElementPosition.item(i);
        	 String nom  = courant.getAttribute("nom");
        	 if ( ! nom.isEmpty()) {
	        	 
	             String skipper  = courant.getAttribute("skipper");
	             String chaineDistance = courant.getAttribute("distance_arrivee");
	             double distance = 0;
	             GregorianCalendar dateEtHeure = null;
	             boolean boooleanAbd = false; 
	             if (chaineDistance.isEmpty()) {  // le skipper a abandonne
	            	 boooleanAbd = true ;
	                }
	             else 
	                if (chaineDistance.startsWith("Date")) {  // le skipper est arrive
	                	dateEtHeure = new GregorianCalendar (
	                    		Integer.parseInt(chaineDistance.substring (21,25)),	  	// annee
	                    		Integer.parseInt(chaineDistance.substring (18,20)) -1,	// mois janvier=0, fev=1 ...
	                    		Integer.parseInt(chaineDistance.substring (15,17)),	  	// jour
	                    		Integer.parseInt(chaineDistance.substring (26,28)),		// heure
	                    		Integer.parseInt(chaineDistance.substring (29,31)),		// minute 
	                    		Integer.parseInt(chaineDistance.substring (32,34)) 		// seconde
	                    		);
	                   }                    	 
	                else        {  		//le skipper est en mer
	                	distance = Double.parseDouble(chaineDistance.replace(',', '.'));	 
	                }
	               Position position =  new Position ( nom, skipper,  distance, dateEtHeure, boooleanAbd);
	               hashSetPositions.add(position); 
	               
	           }
        	 
         }
         // Affichage pour tester
         return hashSetPositions ;
        
    } //try
    catch (SAXException e) {e.printStackTrace();}
    catch (IOException e) {e.printStackTrace();}
    catch (ParserConfigurationException e) {e.printStackTrace();}
    return null;
	}
		
}



