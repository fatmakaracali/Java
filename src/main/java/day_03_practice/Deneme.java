package day_03_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string deger giriniz...");

        String name = input.next();
        String newName = "";

        for (int i = name.length() - 1; i > -1; i--) {
            newName = newName + name.charAt(i);


        }
        System.out.print(newName + " ");

        System.out.println(" ");
        boolean polindrome = name.equalsIgnoreCase(newName);
        System.out.println("polindrome = " + polindrome);

        System.out.println();


            /*
    Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
    Eger İlk kelimenin karakter sayısı çift ise,
      ikinci kelimeyi birinci kelimenin ortasına koyun.
    İlk kelimenin karakter sayısı tek ise, konsola
    "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.


*/


        System.out.println("Lutfen kelime giriniz");
        String kel = input.next();
        System.out.println("kelime gir");
        String kel2 = input.next();

        if (kel.length() % 2 == 0) {

            String firsthalf = kel.substring(0, kel.length() / 2);
            String lasthalf = kel.substring(kel.length() / 2);
            System.out.println(firsthalf + kel2 + lasthalf);

        } else {
            System.out.println("nanay");
        }


        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "u";
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has ==>" + el);
        } else {
            System.out.println("Array does not have ==> " + el);
        }

        String namess[] = {"K", "C", "R", "A", "S"};
        String ell="K";
        int counter1=0;

        for(String w : namess){
            if(w.equals(ell)){
                counter1++;
                break;
            }
        }
        if(counter>0){
            System.out.println("on");}
        else{
            System.out.println("no");}




        Arrays.sort(namess);
        int result1 =Arrays.binarySearch(namess,ell);
        System.out.println(result1);

        if(result1<0){
            System.out.println("ok");
        }
        else {
            System.out.println("aha");}






    }
}