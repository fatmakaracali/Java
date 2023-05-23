package day38enumsiterators;

import java.util.*;

public class Iterator01 {

    /*
    1)Iterator'lar loop'larin yaptigi ayni isi yapar.
    2)Iterator'larda sonsuz loop olusma ihtimali yoktur
    3) Iterator'lar ile loop'lar arasinda performans farkli yoktur
    4)Iterator'lar bir collection'dan eleman silme ve bir collction'daki elemani degistirme konusunda daha basarilidir
    5) iki tip Iterator var.
         i) Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veye elemani degistirmek mumkun degildir
         ii)ListIterator:Bu eleman silebilir, ekleyebilir ve degistirebilir
         NOTE:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir
              "ListIterator" ise iki yonlu calisabilir
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clara, Angie, Mark]

        //Iterator kullanalim

       Iterator<String> myItr= myList.iterator();

        while (myItr.hasNext()) {//hasNext() pointer'a senden sonra eleman varmi diye sorar. varsa true, yoksa false dondurur

            myItr.next();// next() methodu pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder

            myItr.remove();//next methodunun return ettigi elemani siler

        }
        System.out.println(myList); //[]

        //listIterator kullanalim

        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!");//set methodu list'i update etmeye yarar

        }
        System.out.println(yourList);// [ Tom!,   Jim!,   Clara!,   Angie!,   Mark! ]

        while(yourListItr.hasPrevious()) {

            String el = yourListItr.previous();
            System.out.print(el);
            System.out.println();
            yourListItr.set("?" + el);

        }
        System.out.println(yourList);

        //En sondan en basa nasil iterate edebiliriz?

       LinkedList <String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

      Iterator<String> ourListItr=  ourList.descendingIterator();

      while(ourListItr.hasNext()){

          String el=ourListItr.next();
          System.out.println(el);
      }



    }
}
