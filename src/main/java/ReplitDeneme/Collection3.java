package ReplitDeneme;

import java.util.ArrayList;

public class Collection3 {

    public static void main(String[] args) {

        /*
        Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
         */

        ArrayList<String> words= new ArrayList<>();
         words.add("beyaz");
        words.add("siyah");
        words.add("sari");
        words.add("kirmizi");
        words.add("turuncu");

        System.out.println(words.get(0));
        System.out.println(words.get(2));
    }
}
