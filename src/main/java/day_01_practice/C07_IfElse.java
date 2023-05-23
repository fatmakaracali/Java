package day_01_practice;

import java.util.Scanner;

public class C07_IfElse {

    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int a=input.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int b= input.nextInt();

        if(a>b){
            System.out.println("\"buyuktur\" = " + "buyuktur");
        } else {
            System.out.println("\"kucuktur\" = " + "kucuktur");
        }
    }
}
