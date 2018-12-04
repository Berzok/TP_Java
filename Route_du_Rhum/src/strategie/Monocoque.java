package strategie;

public class Monocoque extends Voilier{
	
	public Monocoque(String leNom, SuivreRoute laRoute){
		super(leNom, laRoute);
		}
	public Monocoque(String leNom){
		super(leNom);
	}
	
	
	
	public String toString(){
		return super.toString() + ", monocoque.\n";
		}
}
