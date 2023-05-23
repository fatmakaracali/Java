package day_01_practice;

import java.util.Scanner;

public class C04_Deneme {

    public static void main(String[] args) {
        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("kenar giriniz");
        int a= scan.nextInt();
        System.out.println("diger kenar giriniz");
        int b= scan.nextInt();

        System.out.println("cevre :"+ 2*(a+b));

    }
}
