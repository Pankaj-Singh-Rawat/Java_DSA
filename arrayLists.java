package Java_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        <syntax>
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(55);
//        list.add(43);
//
//        System.out.println(list);
//        System.out.println(list.contains(67));
//        System.out.println(list.set(0,111));
//        list.remove(1);
//        System.out.println(list.get(0));
//        System.out.println(list);
//
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}
