package day29collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deneme {

    public static void main(String[] args) {

                LinkedList<String> sll = new LinkedList<>();
                sll.add("B");
                sll.add("A");
                sll.addFirst("B");
                sll.addFirst("C");
                sll.add("B");



         System.out.println(sll);
        //[C, B, B, A, B] yazar
        sll.removeFirstOccurrence("B");
         System.out.println(sll);
        //  Console'a [C, B, A, B] yazar
        sll.removeLastOccurrence("B");
        System.out.println(sll);
        //  Console'a [C, B, B, A] yazar
        System.out.println(sll.getLast() + sll.getFirst() + sll.get(2));
        // Console'a BCB yazar

        /////////////////////////////////

        System.out.println();

        List<String> m = new ArrayList<>();
        m.add("B");
        m.add("C");
        m.add("A");
        Collections.sort(m);
        for(int i = m.size()-1; i>=0; i--) {
            System.out.print(m.get(i) + " ");



    }
        /////////////////////////7

        System.out.println();

        List<String> ab = new ArrayList<>();
        m.add("B");
        m.add("C");
        m.add("A");
        Collections.sort(m);
        Collections.reverse(m);
        for(int i = 0; i<m.size(); i++) {
            System.out.print(m.get(i) + " ");}
}}
