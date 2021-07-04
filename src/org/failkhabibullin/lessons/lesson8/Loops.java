package org.failkhabibullin.lessons.lesson8;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {

		// For loop

		/*		Scanner scan = new Scanner(System.in);
		for (int i = 11; i < 16; i++) {
			int line = scan.nextInt();
			System.out.println(i * line);
		}*/

		// While loop
		/*		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}*/

		// Do While loop
		int x = 2021;
		int digit = 0;
		do {
			digit = x % 10;
			x = digit / 10;

			System.out.println(digit);
		} while (x > 0);

	}
}