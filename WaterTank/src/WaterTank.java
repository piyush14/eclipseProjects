

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame implements Runnable {

	int y1 = 0, y2 = 400, y3 = 400;
	String cap = "70";
	Thread t1,t2,t3;
	public WaterTank() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		 t1 = new Thread(this);
		 t2 = new Thread(this);
		 t3 = new Thread(this);
		t1.setName("inlet");
		t2.setName("outlet");
		t3.setName("controller");	
		
		t1.start();
		t2.start();
		t3.start();
		
	}
		
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		g.fillRect(150, 200-y1, 200, 200+y1);
		g.drawString(cap, 380, 200);
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	@Override
	public void run() {
		Graphics g = null;
		String temp = null;
		for(;;){
			Thread currentThread  = Thread.currentThread();
			if(currentThread.getName().equals("inlet")){
				y1=(y1+ 5);
				Integer i = Integer.parseInt(cap);
				i++;
				cap = i.toString();
				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					//repaint();
			}
			
			
			if(currentThread.getName().equals("outlet")){
				Integer i = Integer.parseInt(cap);
				i--;
				cap = i.toString();
				y1=(y1-7);
				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					//repaint();
			}
			
			if(currentThread.getName().equals("controller")){
				Integer i = Integer.parseInt(cap);
				i++;
				cap = i.toString();
				y1=(y1+ 5);
				
				if(i>82){
					t1.suspend();
					t2.resume();
				}
				if(i<60){
					t2.suspend();
					t1.resume();
				}

				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					//repaint();
			}
		}
	}
}
