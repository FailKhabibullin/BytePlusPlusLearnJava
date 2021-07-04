package org.failkhabibullin.lessons.lesson12;

import java.util.Arrays;

public class MethodsPart1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};


		int[] c = combineArray(a, b);

		for (int i : c) {
			System.out.print(i + ", ");
		}

		System.out.println();

		int[] x = combineArray(new int[]{213, 45, 5, 65}, new int[]{35, 65, 4, 12, 8});

		Arrays.stream(x).mapToObj(i -> i + ", ").forEach(System.out::print);
	}

	private static void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}

	private static void multiplyElement(int[] array, int val) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= val;
		}
	}

	private static int getStrLength(String str) {
		return str.length();
	}

	private static int[] combineArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		int i = 0;
		for (int j = b.length; j < c.length; j++) {
			c[j] = b[i];
			i++;
		}

		return c;
	}
}