package org.failkhabibullin.lessons.lesson4;

import java.util.Scanner;

public class InputAndOutputToConsole {

  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int i = in.nextInt();

    System.out.println(i);

    double d = in.nextDouble();
    System.out.println(d);
  }
}
