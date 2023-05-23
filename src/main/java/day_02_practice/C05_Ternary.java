package day_02_practice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {


        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int num= scan.nextInt();

        System.out.println(num%2==0 ? ("even number") : (num+3));

    }
}
