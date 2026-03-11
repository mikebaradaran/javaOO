package oop_labs;

public class Program2 {

	public static void main(String[] args) {

		System.out.println("Starting...");
		String name = "";
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 1; i < 1000000; i++) {
			builder.append("."); 
		}
		
		name = builder.toString();
		
		System.out.println(name);
	}

}
