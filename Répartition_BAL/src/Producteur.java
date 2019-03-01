import java.util.Random;




public class Producteur extends Thread{
	
	private Bobox bobox;
	private String alphabet[] = {"ananas","balle", "chat", "daemon", "etriper", "fantasme", "gomene", "hehehe", "ignifuge", "java",
								 "kleptophile", "lilith", "makara", "nihkee", "operatum", "prion", "Quel'Dorei", "ribambelle", "salsifi",
								 "tirion", "unairu", "valkyr", "wagon", "xerxes", "yrel", "zenith"};


	
	public Producteur(Bobox leMana){
		this.bobox = leMana;
	}
	
	public synchronized void run(){
		while(true){
			while(bobox.isFree() == true){
				System.out.println("Le facteur est passé!");
				bobox.deposer(ecrireMissive());
			}
		}
	}
		
	
	private String ecrireMissive(){
		Random rand = new Random();
		return alphabet[rand.nextInt(alphabet.length)];
	}

}
