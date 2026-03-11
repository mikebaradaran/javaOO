package oop_labs;

import java.util.Scanner;

public class Utils {

	Scanner s = new Scanner(System.in);

	public int getInt(String prompt) {
		System.out.println(prompt);
		int x = s.nextInt();
		return x;
	}
}
