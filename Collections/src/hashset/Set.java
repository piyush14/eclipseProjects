package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>();
		
		List<Integer> myList = new ArrayList<Integer>();
		
		hashset.add(1);
		hashset.add(10);
		hashset.add(5);
		hashset.add(3);
		
//		
//		for(Integer i : hashset){
//			System.out.println(i);
//		}
		//System.out.println("linked");
		
		linkedhashset.add(1);
		linkedhashset.add(5);
		linkedhashset.add(3);
//		
//		for(Integer i : linkedhashset){
//			System.out.println(i);
//		}
		
		myList.add(10);
		myList.add(50);
		myList.add(20);
		
		ListIterator<Integer> lt = myList.listIterator();
		System.out.println("forward");

		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println("Backward");
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
		
	}

}
