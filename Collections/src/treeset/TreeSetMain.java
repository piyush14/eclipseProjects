package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		Set<Person> set = new TreeSet<Person>(new WeightComparator());
		
		set.add(new Person("ABC",70,9.5));
		set.add(new Person("PQR",70,6.8));
		set.add(new Person("XYZ",62,7));
		
		
		Iterator<Person> itr =  set.iterator();

		for(Person p :set){
			System.out.println(p);
		}
	}
	
	

}
class WeightComparator implements Comparator<Person>{

	 @Override
	   public int compare(Person e1, Person e2) {
	        if(e1.getWeight() > e2.getWeight()){
	            return 1;
	        }
	        else if(e1.getWeight() == e2.getWeight()){
	        	HeightComparator h = new HeightComparator();
	        	
	        	return h.compare(e1, e2);
	        }
	        else {
	            return -1;
	        }
	    }
	
}



class HeightComparator implements Comparator<Person>{

	 @Override
	 public int compare(Person e1, Person e2) {
		if(e1.getHeight() > e2.getHeight()){
            return 1;
        }
        else if(e1.getHeight() == e2.getHeight()){
        	return 0;
        }
        else {
            return -1;
        }
	
	 }
}

class Person {
	public int weight;
	public double height;
	public String name;
	
	public Person(String name,int weight,double height){
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public String toString(){
		return this.name +" "+this.weight +" "+this.height;
	}

	public double getHeight(){
		return height;
	}
	
	public int getWeight(){
		return weight;
	}
	
//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}