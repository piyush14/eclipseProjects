package chatapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ChatMain {
	 static HashMap<String, ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();
	 static ArrayList<String> users = new ArrayList<String>();
		static Scanner sc= new Scanner(System.in);


	public static void main(String[] args) {
		
		int choise;
		System.out.println("Enter You Choise");
		System.out.println("1) Create a chatroom\n" +
				"2) Add the user\n"+
				"3) User login	\n"+
				"4) Send a message\n"	+
				"5) Display the messages from a specific chatroom	\n"+
				"6) List down all users belonging to the specified chat room.	\n"+
				"7) Logout	\n"+
				"8) Delete an user	\n"+
				"9) Delete the chat room.	\n"+
				"Please enter your option:");
		
		choise = sc.nextInt();
		switch(choise){
		case 1 : 
				addChatroom();
					
		case 2 : displayAllUsers();
		case 3 : addChatroom();
			
		case 4 : displayAllUsers();
		
		}
		
		 
		 

		 

		 
	}
	
	
static public void addChatroom(){
	users.clear();
	System.out.println("Enter chatroom name");
	String chatRoomName = sc.nextLine();
	
	System.out.println("Enter user 1  name for chatroom : "+chatRoomName);
	String user1 = sc.nextLine();
	System.out.println("Enter user 2  name for chatroom : "+chatRoomName);
	String user2 = sc.nextLine();
	
	
	 
	 users.add(user1);
	 users.add(user2);
	 
	 multiMap.put(chatRoomName, users);

	}


	static public void displayAllUsers(){
		System.out.println("All users------------------s");
		 Set <Entry<String, ArrayList<String>>> setMap = multiMap.entrySet();
		 Iterator<Entry<String,  ArrayList<String>>> iteratorMap = setMap.iterator();
		 while(iteratorMap.hasNext()){
			 Map.Entry<String, ArrayList<String>> entry =(Map.Entry<String, ArrayList<String>>) iteratorMap.next();
			 String key = entry.getKey();
			             List<String> values = entry.getValue();
			             System.out.println("Key = '" + key + "' has values: " + values);


		 }
	}
}



class Functions{
	public String name;
	public String passwd;
	public String chatRoom;
	
	
}