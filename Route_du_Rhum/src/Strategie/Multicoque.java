package Strategie;

public class Multicoque extends Voilier{
	
	public Multicoque(String leNom, SuivreRoute laRoute){
		super(leNom, laRoute);
		}
	public Multicoque(String leNom){
		super(leNom);
	}
	public String toString(){
		return super.toString() + ", multicoque.\n";
		}
}
