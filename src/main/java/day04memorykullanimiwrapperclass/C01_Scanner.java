package day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Kullanicidan aldiginiz 5 basamakli
        //bir sayinin ilk 2 ve son 2 basamagindaki
// sayilarin toplamini yazdiran kodu olusturunuz


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz.");

        int number = input.nextInt();

        // son rakami al

        int lastDigit = number %10; // son sayiyi verir.
        number = number/10 ;        // sayiyi kucult

        int forthDigit = number%10;
        number = number/10;

        int thirdDigit = number%10;
        number = number/10;

        int secondDigit = number%10;
        number = number/10;

        int firstDigit= number%10;
        System.out.println( lastDigit+forthDigit+secondDigit+ firstDigit);

    }


}
