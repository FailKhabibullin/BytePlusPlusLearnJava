package org.failkhabibullin.lessons.lesson5;

public class Math {
  public static void main(String[] args) {
    // + Adding
    int a = 5;
    int b = 7;
    int c = a + b;

    System.out.println(c);

    // - Subtract
    int a1 = 8;
    int b1 = 90;
    int c1 = a1 - 55;

    System.out.println(c1);

    // * Multiple
    int a2 = 5;
    double b2 = 0.5;
    double c2 = b2 * a2;

    System.out.println(c2);

    // / Division
    double a3 = 0.5;
    double b4 = 0.2;

    double c3 = a3 / b4;

    System.out.println(c3);

    // ++ Incrementing
    int x = 5;
    x++;
    ++x;

    int i = x++;
    System.out.println(i);

    int x1 = 10;
    int i1 = x1--;
    System.out.println(x1);
    System.out.println(i1);

    // Divide Mode
    int y = 5 / 2;
    double y1 = 5. / 2;
    System.out.println(y);
    System.out.println(y1);

    // Taking the remainder
    int y2 = 5 % 2;
    System.out.println(y2);
  }
}
