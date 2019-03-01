



public class Bobox{
	
	private Boolean available = true;
	private String content;
	
	
	public synchronized void deposer(String message){
		content = message;
		available = false;
		notifyAll();
	}
	
	public synchronized String retirer(){
		while(available == true){
			try {
				wait();
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println(content);
		available = true;
		notifyAll();
		return content;
	}
	
	public Boolean isFree(){
		return available;
	}
	
	public void setStatus(Boolean bool){
		available = bool;
	}
	
	
}
