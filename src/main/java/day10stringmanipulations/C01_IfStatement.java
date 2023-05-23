package day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        // Verilen harf bir karakterin buyuk harf ise ekrana "Buyuk harf " yazdiran kodu yaziniz





        char ch= 'A';
        if(ch>='A'&& ch<='Z'){
            System.out.println("Buyuk Harf");}

        //Verilen sayi cift sayi ise ekrana "Cift Sayi" yazdiran kodu yaziniz




        int sayi= 24;
        if(sayi%2==0){
            System.out.println("Cift Sayi");}

        // verilen bir sayi 300'den kucuk veya 1200'den buyuk ise "Harika Sayi" yazdiran kodu yaziniz

        int sayi2= 201;

        if(sayi2<300 || sayi2>1200){
            System.out.println("Harika Sayi");}

        // Kullanicidan alinan datanin tek mi cift mi olddugunu yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        //1.yol Bagimsiz if statement

        if(num%2==0){
            System.out.println("Cift sayi");}

        if(num %2 !=0){
            System.out.println("tek sayi");}




        //2.yol  if else

        if(num%2==0){
            System.out.println("Cift sayi");}else{ System.out.println("tek sayi");}

        // verilen sayinin negatif, pozitif minotr mu oldugunu yazdiran bir kod yaziniz

        byte num1= -5;
        if(num1<0){
            System.out.println("negatif sayi");}else if(num1==0){
                System.out.println("Notr Sayi");}else{
                System.out.println("pozitif sayi");}












    }
}
