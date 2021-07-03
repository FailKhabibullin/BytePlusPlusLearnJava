package org.failkhabibullin.lessons.lesson7;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();

		switch (c) {
			case 1:
				System.out.println("Green");
				break;
			case 2:
				System.out.println("Red");
				break;
			case 3:
				System.out.println("Blue");
				break;
			default:
				System.out.println("Not found number");
				break;
		}*/


		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();


		switch (str.toLowerCase()) {
			case "green":
				System.out.println(1);
				break;
			case "red":
				System.out.println(2);
				break;
			case "blue":
				System.out.println(3);
				break;
			default:
				System.out.println("Color no found!");
				break;
		}

	}
}
