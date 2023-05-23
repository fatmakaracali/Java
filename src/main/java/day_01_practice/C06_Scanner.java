package day_01_practice;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String nSrnm = scan.nextLine().toUpperCase();

        char name = nSrnm.charAt(0);
        char surname = nSrnm.charAt(nSrnm.indexOf(" ")+1);

        System.out.println(""+name+surname);




    }
}
