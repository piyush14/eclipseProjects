package threads;

public class PingPongMain extends Thread{

	Thread t1,t2,t3;
	
	
	static Thread t = new Thread() {
	    public void run() {
	        
	    	System.out.println("ANNONYMUS class thread");
	    	
	    	
	    	
	    }
	};
//	@Override
//	public void run() {
//		Thread currentThread = Thread.currentThread();
//		
//		if(currentThread.getName().equals("PING")){
//			for(int i=0 ;i<10;i++){
//				System.out.println("PING");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		else if(currentThread.getName().equals("PONG")){
//			for(int i=0 ;i<10;i++){
//				System.out.println("\tPONG");
//				try {
//					Thread.sleep(700);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		else if (currentThread.getName().equals("TONG")){
//			for(int i=0 ;i<10;i++){
//				System.out.println("\t\tTONG");
//				try {
//					Thread.sleep(300);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
//	}
	
	
	public static void main(String[] args) {

		new PingPongMain();
		PingPongMain t1 = new PingPongMain();
		PingPongMain t2 = new PingPongMain();
		PingPongMain t3 = new PingPongMain();

		
		
		
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
	}



}
