package oop_labs;

public class Person {
	String name;
	private int age;
	int gender;

	public Person(String name, int age) {
		this.name = name;	
		this.age = age;
	}
	
	public Person(String name) {
		this(name, 0);
//		this.name = name;	
//		this.age = 0;
	}
	
	
	
	public void walk() {
		System.out.println(name + " Person walking!");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int x) {
		if (x < 0) {
			System.out.println("Invalid age!");
		} else {
			age = x;
		}
	}
}
