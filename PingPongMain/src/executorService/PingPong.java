package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingPong {
	
	
	
	
	
	
	
	public static void main(String[] args){
		
		
		
		ExecutorService executor = Executors.newFixedThreadPool(1);	
		 Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++)
					System.out.println("PING");
			}
		};
		
		 Runnable r2 = new Runnable() {
			@Override

			public void run() {
				for(int i=0;i<10;i++)
					System.out.println("\tPONG");
			}
		};
		
		
		executor.execute(r1);
		executor.execute(r2);

		
	}
		
}





