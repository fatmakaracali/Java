package ReplitDeneme;

import java.util.LinkedList;

public class Collection6 {
    public static void main(String[] args) {

      /*  Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
LinkedList elemanları: sari,mavi,mor,yesil,beyaz
 Beklenen Çıktı:
 sari
  mavi
  mor
  yesil
  beyaz


       */
        LinkedList<String> s= new LinkedList<>();

        s.add("sari");
        s.add("mavi");
        s.add("mor");
        s.add("yesil");
        s.add("sari");
        s.add("beyaz");

        System.out.println(s.get(0));
        System.out.println(s.get(1));
        System.out.println(s.get(2));
        System.out.println(s.get(3));
        System.out.println(s.get(4));



    }
}
