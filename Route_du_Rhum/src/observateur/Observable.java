package observateur;

public interface Observable{
	
	
	public void enregistrer(Observateur obs);
	
	public void oublier(Observateur obs);
	
	public void informerObservateurs();
	

}
