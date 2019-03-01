package api_concurrent;



public class Consommateur implements Runnable{
	
	private Bobox bobox;
	private String lettre;
	
	
	public Consommateur(Bobox leMana){
		this.bobox = leMana;
		
	}
	
	public void run(){
		while(true){
			try {
				lettre = bobox.retirer();
				System.out.println("Obtention["+lettre+"]");
				System.out.println("--Queue--"+bobox.queue);
				}
			catch (InterruptedException e) {
				e.printStackTrace();
				}
			
			try {
				Thread.sleep(600);
				}
			catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		}
	
	public String getLettre(){
		return this.lettre;
	}
	
}
