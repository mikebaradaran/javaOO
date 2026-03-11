package oop_labs;

import java.util.*;

public class Program2 {

	public static void main(String[] args) {

		HashMap<String, Car> hm = new HashMap<>();

		hm.put("Sam", new Car("Ford"));
		hm.put("Joe", new Car("BMW"));

		Car car = hm.get("Sam");
		System.out.println(car.model);

		car = hm.get("Joe");
		System.out.println(car.model);
		
//		car = hm.get("Mike");
//		if(car == null) {
//			System.out.println("Unable to get Mike's car!");
//		}
		

		if(hm.containsKey("Sam")) {
			car = hm.get("Sam");
			System.out.println( car.model);
		}
		else {
			System.out.println("Unable to get the car!");
		}
		
	}

}


class Car{
	String model;
	
	public Car(String model) {
		this.model = model;
	}
}
