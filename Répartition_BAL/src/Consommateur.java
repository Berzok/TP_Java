


public class Consommateur extends Thread{
	
	private Bobox bobox;
	private String lettre;
	
	
	public Consommateur(Bobox leMana){
		this.bobox = leMana;
		
	}
	
	public synchronized void run(){
		while(true){
			this.retirerLettre();
			notifyAll();
			}
		}
	
	
	
	private void retirerLettre(){
		lettre = bobox.retirer();
	}
	
	private void lire(){
		System.out.println("\nOn ouvre la lettre et on la lit");
		System.out.println(lettre);
		bobox.setStatus(true);
	}
	
}
