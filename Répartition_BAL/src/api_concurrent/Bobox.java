package api_concurrent;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;




public class Bobox{
	
	public BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
	
	public void deposer(String message) throws InterruptedException{
		queue.put(message);
	}
	
	public String retirer() throws InterruptedException{
		String message;
		message = queue.take();
		return message;
	}
	
	
	
}
