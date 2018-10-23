package lepackage;

public class Monocoque extends Voilier{
	
	public Monocoque(String leNom, SuivreRoute laRoute){
		super(leNom, laRoute);
		}
	
	
	
	public String toString(){
		return super.toString() + ", fier monocoque";
		}
}
