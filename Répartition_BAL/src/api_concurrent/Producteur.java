package api_concurrent;



public class Producteur implements Runnable{
	
	private Bobox bobox;
	private String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "*"};


	public Producteur(Bobox leMana){
		this.bobox = leMana;
	}
	
	public void run(){
		int i = 0;
		while(true){
			try {
				bobox.deposer(alphabet[i]);
				System.out.println("Insertion["+alphabet[i]+"]");
				System.out.println("--Queue--"+bobox.queue+"  ");
				}
			catch (InterruptedException e) {
				e.printStackTrace();
				}
			
			try {
				Thread.sleep(100);
				}
			catch (InterruptedException e) {
				e.printStackTrace();
				}
			i++;
			if(i == 27)
				break;
		}
		return;
	}

}
