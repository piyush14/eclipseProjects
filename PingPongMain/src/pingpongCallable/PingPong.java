package pingpongCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PingPong {
	public static void main(String [] args) throws InterruptedException, ExecutionException{
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Callable<Void> c1 = new Callable<Void>(){
					@Override
					public Void call() throws Exception {
						for(int i=0;i<10;i++){
							System.out.println("PING");
							Thread.sleep(100);
						}
					return null;
				}
			};
			
		Callable<Integer> c2 = new Callable<Integer>(){
			@Override
			public Integer call()throws Exception{
				for(int i=0;i<10;i++){
					System.out.println("\tPONG");
					Thread.sleep(100);

				}
				return 1;
			}
		};
		
		
		//Future<Integer> future1 =
		executor.submit(c1);
		Future<Integer> future2 = executor.submit(c2);

		//int result1 = future1.get();
		int result2 = future2.get();
		
		System.out.println("RESULT : "+result2);
		
		
	}
}
