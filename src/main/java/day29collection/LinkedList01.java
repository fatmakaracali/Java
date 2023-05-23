package day29collection;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        //Arraylist'ler eleman ekleme ve silmede tekrar indeksleme yapma zorunda olduklarindan eleman ekleme ve silmede
        //  basarisizdirlar.

        //Linkedlist'ler index kullanmazlar. bu yuzden eleman ekleme ve silme islemlerinde tekrar indexleme
        // yapilmaz

        //Linklistlerde node ekleme ve silme islemleri yaparken sadece pointer'lari degistirir

        /*1) Linklist'ler node silme ve ekleme 'de cok basarili olduklari icin, silme ve ekleme islemlerini coklukla
        yapacaginiz zaman Linkedlist kullaniniz

        2)Arraylist'ler eleman bulmada cok basarilidir. ArrayList'ler index'leri adres gibi kullanir, bu yuzden Arraylist
        "search" islemlerinde cok basarilidir
        Note: Ihtiyaciniz olan collction cogunlukla silme ve ekleme yapacaksa (muze ziyaretleri) gibi Linklist,
        search yapacaksa (Amerika eyaletleri) ArrayList kullaniniz

         */

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add("Esen");
        s.add("Kemal");
        s.add("Ajdar");


        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");

        System.out.println(s);  //[Steve, Ajda, Muge, Cuneyt, Esra]

       // s.remove(2);
        System.out.println(s);

       //  s.remove("Ajdar");
        System.out.println(s);

        // s.remove();    //ilk elemani siler
        System.out.println(s);

      //  s.removeFirstOccurrence("Esra"); // ilk Esra silinir
      //  s.removeLastOccurrence("Esra");  // son esra silinir

        String r1 = s.peek();   //ilk elemmani size getirir ama silmez  (copy-paste)
        System.out.println(r1);
        System.out.println(s);

         String r2 =s.poll();
        System.out.println(r2);  // ilk elemani verir ve list'ten siler (cut-paste)
        System.out.println(s);


        s.element();  //ilk elemani silmeden verir.

        //peek() ile element() : ikisi de iki elemani silmeden verir
        //ama peek() list bos oldugunda size "null" verir, element ise "hata" verir

        String s4= s.pop();  //removefirst'le ayni
        System.out.println(s4);

        //note: poll ile pop : ikisi de ilk elemani siler ve size verir. ama poll (), list bos oldugunda "null" verir
        //pop ise "hata" verir
    }


}
