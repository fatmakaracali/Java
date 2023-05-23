package day20arraylistdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {


    /*
    1) String class kullanmak tercih edilir. cunku aString class method acisindan cok zengindir
    2) List.of() kullanarak kisa yoldan List olusturabiliriz ama
       i) bu listlerin elemanlari degistirilemez
       ii)bu list'lere eleman eklenemez
       iii)bu list'lerden eleman silinemez
     */

    /*
    Example 1: kullanicinin girdigi harf list'te var ise o harfi "buldum!" a cevirin yoksa o harfi list'e'ekleyin
     */
    public static void main(String[] args) {

       List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();

        Scanner input = new Scanner(System.in);
        int counter=0;

        do {
            if( counter ==size){
                System.out.println(myList);
                break;
            }
            System.out.println("Please enter  a letter");
            String letter = input.next().toUpperCase().substring(0, 1);
            System.out.println(myList);

            if (myList.contains(letter)) {

                myList.set(myList.indexOf(letter), "Buldum");
            } else {
                myList.add(letter);


            }
            counter++;
        } while (true);


        Scanner scan = new Scanner(System.in);
        List<String> myListe = new ArrayList<>();
        myListe.add("a");
        myListe.add("b");
        myListe.add("c");

        System.out.println("Please enter a letter");
        String harf = input.next().substring(0,1).toLowerCase();

        if(myListe.contains(harf)){
            myListe.set(myListe.indexOf(harf), "bingo");
            System.out.println(myListe);
        }
        else{
            myListe.add(harf);
            System.out.println(myListe);

        }
    }
}