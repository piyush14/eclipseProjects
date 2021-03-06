package com.ballgame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BallGame extends Frame implements Runnable {

    Thread t1, t2, t3;
    int y1 = 400, y2 = 400, y3 = 400;
	 boolean blueTop = false;
	 boolean redTop = false;
 	boolean greenTop = false;
    ReentrantLock lock = new ReentrantLock();

 	final Condition aCondition = lock.newCondition();

    public static boolean allAtTop = false;
    public BallGame() {

        super("Ball game");
        setBackground(Color.CYAN);
        setSize(500, 500);
        setVisible(true);

        t1 = new Thread(this);
        t2 = new Thread(this);
        t3 = new Thread(this);

        t1.setName("red");
        t2.setName("green");
        t3.setName("blue");

        t1.start();
        t2.start();
        t3.start();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.fillOval(100, y1, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(200, y2, 50, 50);
        g.setColor(Color.BLUE);
        g.fillOval(300, y3, 50, 50);
    }

    @Override
    public void run() {

        Thread currentThread = Thread.currentThread();
        if (currentThread.getName().equals("red")) {
           redBall();
            
        } else if (currentThread.getName().equals("green")) {
        	greenBall();
            
        } else if (currentThread.getName().equals("blue")) {
        	blueBall();
           
        }
    }
    
    public void redBall(){
         boolean redEnd = false;
         for (;;) {
             if (!allAtTop && redEnd) {
            	 lock.lock();
            	 try{
                    	 syncFunction();
            	 }finally{
            		 lock.unlock();
            	 }
             }
             if (redTop) {
                 y1++;
                 if (y1 == 400) {
                	 redTop = false;
                	 redEnd = true;
                 } 
                 else
                 {
                	 redEnd = false;
                 }
             } 
             else 
             {
                 y1--;
                 if (y1 < 50) {
                	 redTop = true;
                	 redEnd = true;
                 } else {
                	 redEnd = false;
                 }
             }
             repaint();
             try {
                 Thread.sleep(10);
             } catch (InterruptedException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }
         }
    	
    }

    public void greenBall(){
    	
        boolean greenEnd = false;
        for (;;) {
            if (!allAtTop && greenEnd) {
            	lock.lock();
           	 try{
                   	 syncFunction();
           	 }finally{
           		 lock.unlock();
           	 }    
            }
            if (greenTop) {
                y2++;
                if (y2 == 400) {
                	greenTop = false;
                	greenEnd = true;
                } 
                else 
                {
                	greenEnd = false;
                }
            } 
            
            else 
            {
                y2--;
                if (y2 < 50) {
                	greenTop = true;
                	greenEnd = true;
                } else {
                	greenEnd = false;
                }
            }
            repaint();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    	
    }
    
public void blueBall(){
	
     boolean blueEnd = false;
     for (;;) {
         if (blueTop) {
             y3++;
             if (y3 == 400) {
            	 blueTop = false;
            	 blueEnd = true;
                 allAtTop = true;
                // synchronized (this) 
                 lock.lock();
                 try{
                     //notifyAll();
                	 aCondition.signalAll();

                 }finally{
                	 lock.unlock();
                 }
             } else {
            	 blueEnd = false;
                 allAtTop = false;
             }
         } else {
             y3--;
             if (y3 < 50) {
            	 blueTop = true;
            	 blueEnd = true;
                 allAtTop = true;
                 
                 lock.lock();
                 try{
                     //notifyAll();
                	 aCondition.signalAll();

                 }finally{
                	 lock.unlock();
                 }
             } else {
            	 blueEnd = false;
                 allAtTop = false;
             }
         }
         repaint();
         try {
             Thread.sleep(20);
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
     }
    	
    }

 public void syncFunction(){
	try {
		//wait();
		aCondition.await();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
    
    public static void main(String[] args) {

        Frame mf = new BallGame();
        mf.setSize(500, 500);
        mf.setVisible(true);
    }

}