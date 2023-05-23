package day11nestedifternaryswitch;

import java.util.Scanner;

public class Deneme {

     /*Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
    Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
    Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.*/

    //  1) "if" icinde if kullanirsaniz, "nested if" yapmisiz demektir.
    // "nested if" Java'yi yavaslatirve bu yuzden mecbur kalmadikca kullanmayiz
    // "nested if" gibi Javayi yavaslatan kodlar "Time Consuming" olarak adlandirilir

    public static void main(String[] args) {


        int i = 1;
        int j = 0;
        switch (i) {
            case 2 :
                j += 6;

            case 4 :
                j += 1;
            case 1 :
                j += 4;
            default :
                j += 2;
        }
        System.out.println("j = " + j);


        // soru 2
        char ch = 'a';
        switch (ch){
            case 'a' :
            case 'A' :
                System.out.print(ch);
                break;
            case 'b' :
            case 'B' :
                System.out.print(ch);
                break;
            case 'c' :
            case 'C' :
                System.out.print(ch);
                break;
            case 'd' :
            case 'D' :
                System.out.print(ch);
        }

        // soru 3

        int number = 3;
        if(number == 1) {
            System.out.println("One");
        }
        if(number == 2){
            System.out.println("Two");
        }
        if(number == 3){
            System.out.println("Three");
        }

        int number1 = 3;
        switch(number1){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Done");
        }


        // soru 1 Artik yil


        int year=0;

        String result= year%100==0 ?( year%400==0 ? "leap" : "degil"): (year%4==0 ? "leap" : "degil");




        // soru 2Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz  *********



        int num=0;

         Object result1=  num%2==0 ? num/2 : "bu sayi ikiye bolunmez";


        //   Gun isimlerini kullanicidan aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("gun adini giriniz");
        String gun= scan.next();

        switch (gun.toLowerCase()){

            case "sunday" :
                System.out.println(1);
                break;
            case "monday"  :
                System.out.println(2);
                break;

            case "tuesday" :
                System.out.println(3);
                break;
            case "wednesday"  :
                System.out.println(4);
                break;
            case "thursday" :
                System.out.println(5);
                break;
            case "friday"  :
                System.out.println(6);
                break;

            case "saturday" :
                System.out.println(7);
              break;
            default :
                System.out.println("invalid day");



        }








         char m = 'D';
        switch(m) {
            case 'A':
                System.out.println("First letter");
                break;
            case 'B':
                System.out.println("Second letter");
            case 'C':
                System.out.println("Third letter");
                break;
            case 'D':
                System.out.println("Fourth letter");
            default:
                System.out.println("What kind of letter is this?");
        }


    }}