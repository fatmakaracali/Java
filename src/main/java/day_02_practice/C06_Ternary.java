package day_02_practice;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {


        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int a= scan.nextInt();

        System.out.println("Lutfen diger tam sayiyi giriniz");
        int b= scan.nextInt();

        System.out.println(a==b ? ("sayilar birbirine esittir") : (a>b ?("buyuk sayi"+ a) : ("buyuk sayi"+ b)));
    }
}
