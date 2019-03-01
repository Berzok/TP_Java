package api_concurrent;




public class MainProgram {
	
	public static void main(String args[]) throws InterruptedException{
		
		Bobox leMana = new Bobox();
		Producteur u_got_mail = new Producteur(leMana);
		Consommateur omnomnom = new Consommateur(leMana);
		
		Thread leArtisan = new Thread(u_got_mail);
		Thread leMiam = new Thread(omnomnom);
		leArtisan.start();
		Thread.sleep(50);
		leMiam.start();
		
		
		while(true){
			if(omnomnom.getLettre().equals("*"));
				break;
			}
		System.out.println("\nC'est fini");
		}
	}