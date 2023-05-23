package day_02_practice;

import java.util.Scanner;

public class C04_ifElse {
    public static void main(String[] args) {

          /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz");
        String first= scan.next();
        System.out.println("Ikinci kelimeyi giriniz");
        String second= scan.next();

        if (first.length()%2==0){
            String firstwordfirsthalf= first.substring(0,first.length()/2);
            String firstwordsecondhalf= first.substring(first.length()/2);
            System.out.println(firstwordfirsthalf+second+firstwordsecondhalf);
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");

        }
    }
}
