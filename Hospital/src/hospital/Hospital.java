package hospital;

import java.util.Random;

public class Hospital {
	public static void main(String[] args) throws Exception {

        Random r = new Random();
        BloodPressureManagerOuter outerObj = new BloodPressureManagerOuter();
        BloodPressureManagerOuter.HighBloodPressureInner innerObj = outerObj.new HighBloodPressureInner();

        while (true) {
            int value = r.nextInt(200);
            outerObj.addBloodPressure(value);
            outerObj.checkBloodPerssure(innerObj);
           // bm.addData(value);
            Thread.sleep(500);
        }
    }
}

class BloodPressureManagerOuter {

    private int value;
    public void addBloodPressure(int value) {
        this.value = value;
    }
    
    public void checkBloodPerssure(HighBloodPressureInner innerObj){
    	boolean temp = innerObj.checkBloodPressure(value);
    	if(temp){
    		
    		System.err.println("HIGH BLOOD PRESSUER...!!!!");
    	}
    	else{
    		
    		System.out.println("NORMAL BLOOD PRESSURE");
    	}
    	
    }

   
    class HighBloodPressureInner  {

    	 public boolean checkBloodPressure(int value) {
             if (value > 140)
                 return true;
             else
            	 return false;
         }
        

    }

    
}
