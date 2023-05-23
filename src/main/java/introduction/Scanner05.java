package introduction;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        // kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz.
        // 1) alanini hesaplayin
        //2) cevresini hesaplayin

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Dikdortgenin kisa kenar uzunlugunu giriniz");

        double shortSide = input.nextDouble();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz");

        double longSide = input.nextDouble();
        System.out.println(shortSide*longSide);
        System.out.println("cevre=" +2*(shortSide+longSide));










    }
}
