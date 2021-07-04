package org.failkhabibullin.lessons.lesson9;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] mas = new int[8];

        mas[0] = 8;
        mas[1] = 7;
        mas[2] = 6;

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas.getClass());
        }
    }
}
