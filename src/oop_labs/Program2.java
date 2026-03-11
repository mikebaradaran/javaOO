package oop_labs;

import java.util.*;

public class Program2 {

	public static void main(String[] args) {

		List<String> friends = new ArrayList<>();
		friends.add("Tom"); 			
		friends.add("Sue"); 
		friends.add("Sanjeev");
		
		for(String name : friends) {
			System.out.println(name);
		}

	}

}
