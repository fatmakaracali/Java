package day14Loops;

import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {


             /*         Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
         * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
         * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
         * harfi büyük yada küçüklüğüne duyarlıdır.)

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");

        String harf = scan.next();


        boolean r = harf.replaceAll("[^a-zA-Z]", "").length() == 1;
        boolean e = harf.replaceAll("[^aeuioAEUIO]", "").length() == 1;


        if (r) {
            if (e) {
                System.out.println(harf + " Sesli harftir");

            } else {
                System.out.println(harf + " Sessiz harftir");
            }


        } else {
            System.out.println("Gecersiz karakter veya birden fazla karekter girdiniz");
        }
    }
}
