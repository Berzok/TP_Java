package lepackage;

public class Multicoque extends Voilier{
	
	public Multicoque(String leNom, SuivreRoute laRoute){
		super(leNom, laRoute);
		}
	public String toString(){
		return super.toString() + ", fier multicoque!";
		}
}
