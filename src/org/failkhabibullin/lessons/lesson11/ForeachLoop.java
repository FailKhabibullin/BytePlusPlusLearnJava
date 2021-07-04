package org.failkhabibullin.lessons.lesson11;

import java.util.*;

public class ForeachLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};

        ArrayList<String> strings = new ArrayList<>();
        Random rand = new Random();

        strings.add("Java");
        strings.add("C#");
        strings.add("Python");
        strings.add("Ruby");

        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); ) {
            String tpm = iterator.next();
            //            System.out.println(tpm);
        }

        ArrayList<Integer> numbs = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbs.add(new Random().nextInt(10));
        }

        //        numbs.forEach((i -> {
        //            System.out.print(i + ", ");
        //        }));

        for (Iterator<Integer> iterator = numbs.iterator(); iterator.hasNext(); ) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");

        for (int i : hashMap.keySet()) {
            System.out.println(hashMap.get(i));
        }
    }
}
