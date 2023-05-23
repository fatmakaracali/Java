package day04scannerwrapperoperator;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        // kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlarin
        // toplamini yazdiran kodu yaziniz


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz.");


         // bir sayinin son rakamini almak icin o sayiyi 10 a bolup kalanini aliriz
        // bir tamsayiyi bir tamsayiya bolerseniz java sonucu nasil tamsayi yapar?
        // java, ondalik kismi iptal eder.Java yuvarlama yapmaz.

        //% modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        // dalayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir.
        // bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar.
        // bu durumda java yuvarlama yapmaz. ondalikli kismi iptal eder.
        // bir tam sayiyi ona bolersek birler basamagini silmis oluruz.
        int number = input.nextInt();


        // son rakami al.
       int lastDigit= number%10;
       // sayi kucult
       number= number/10;

       // sondan ikinci rakam al
      int lastSecondDigit=  number%10;
     number = number/10;
     //sondan ucuncu rakami al
        int lastThirdDigit= number%10;
        number = number/10;
      // sondan dorduncu rakami al
      int lastFourthDigit = number%10;
      // sayi kucult
        number = number/10;
        //sondan besinciyi al
        int lastFifthDigit = number%10;
        // sayiyi kucult
        number = number/10;
        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);
    }
}
