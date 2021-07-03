package org.failkhabibullin.lessons.lesson6;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		/*		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();

		if (age > 21) {
			System.out.println("> 21");
		}

		if (age >= 18 && age <= 21) {
			System.out.println(" >= 18 && <= 21");
		} else {
			System.out.println("< 18");
		}*/

		int x = 55;


		// Logic type Boolean
		boolean b;

		if (x > 100 && x < 10000 && (x % 5 == 0)) {
			b = true;
		} else {
			b = false;
		}

		System.out.println(b);
	}
}
