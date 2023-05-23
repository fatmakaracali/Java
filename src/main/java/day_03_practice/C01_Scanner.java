package day_03_practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // Kullanicidan aldiginiz bir sekil ile

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sekil giriniz");
        char a=input.next().charAt(0);




        System.out.println(" "+" "+a+ " "+" "+"\n"+" "+a+" "+a+" "+"\n"+a+" "+a+" "+a);

        // kullanicidan 2 sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        System.out.println("Lutfen bir sayi giriniz");
        int s=input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int s1= input.nextInt();

        System.out.println(s+s1);
        System.out.println(s-s1);
        System.out.println(s*s1);
        System.out.println(s/s1);

        // kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki rakamlari toplamini bulan kodu yaziniz

        System.out.println("Lutfen sayi giriniz");
        int s2= input.nextInt();
      int e= s2 %10;
       int r=(s2/10)%10;
       int t =(s2/100)%10;
       int y=(s2/1000)%10;
       int u=s2/10000;
        System.out.println(e+r+y+u);

        //input 12345 ==>1+2+4+5
        //output==>12

        // 1.Yol
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();//12345

        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRkm = " + ilkIkiRkm);

        int ilkIkiToplam = (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);

        int sonIkiRkm= num%100;//45
        int sonIkiRkmToplam = (sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiRkmToplam = " + sonIkiRkmToplam);
        int toplam=ilkIkiToplam+sonIkiRkmToplam;
        System.out.println("toplam = " + toplam);




    }
}
