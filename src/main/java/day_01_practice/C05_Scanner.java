package day_01_practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

         /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String surname = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int age = scan.nextInt();

        System.out.println("Lutfen boyunuzu giriniz");
        int weight = scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz");
        int size = scan.nextInt();

        System.out.println("name :"+name + "\n" +"surname :"+ surname +"\n" +"age :"+ age+"\n" +"weight :"+ weight+"\n" +"size :"+ size);






    }
}
