package oop_labs;

import java.util.HashMap;

public class Zoo {
	HashMap<String, Integer> animalMap = new HashMap<>();
	String[] originalAnimals = { "Zebra", "Lion", "Buffalo" };
	String[] newAnimals = { "Zebra", "Gazelle", "Buffalo", "Zebra" };

	public Zoo() {
		// get each animal name from originalAnimals and pass it to addAmimal()
		for(String name : originalAnimals) {
			addAnimal(name);
		}
		for(String name : newAnimals) {
			addAnimal(name);
		}
		for (String key : animalMap.keySet()) {
		     System.out.printf("%12s count is %d\n", key, animalMap.get(key));
		}
	}

	private void addAnimal(String name) {
		// add it to animalMap using the name as Key If animalMap contains the name
		// increase the count ELSE set the count to 1
		int x = 1;
		
		if (animalMap.containsKey(name)) {
			x = animalMap.get(name)+1; // get the count and increase by 1
		}
		
		animalMap.put(name, x);	
		
	}
}
