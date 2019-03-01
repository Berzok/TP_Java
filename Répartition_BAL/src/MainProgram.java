



public class MainProgram {
	
	public static void main(String args[]){
		
		Bobox leMana = new Bobox();
		Producteur u_got_mail = new Producteur(leMana);
		Consommateur omnomnom = new Consommateur(leMana);
		u_got_mail.setDaemon(true);
		omnomnom.setDaemon(true);
		
		omnomnom.start();
		u_got_mail.start();
		while (true)
			continue;
	}
	
	
}
