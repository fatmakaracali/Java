package day_01_practice;

import java.util.Scanner;

public class C05_Deneme {

    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi giriniz");
        String nS= scan.nextLine().toUpperCase();

        char first = nS.charAt(0);
        char second= nS.charAt(nS.indexOf(" ")+1);
        System.out.println(" "+first+second);


    }
}
