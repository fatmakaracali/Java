package SSG_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07 {

    public static void main(String[] args) {

        /*

        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun, kullanicidan bir sayi isteyip listede
        var olup olmadigini kullaniciya yazin
         */

        Random randomSayilar = new Random();

        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {

            sayi = randomSayilar.nextInt(1000);
            if (!sayiListesi.contains(sayi)) {

                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);

        Scanner scan = new Scanner(System.in);
        int kalanTahmin = 5;
        int tahminSayisi = 0;

        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            tahminSayisi++;

            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler");
                break;
            }
            kalanTahmin--;
            System.out.println("kalanTahmin sayisi "+kalanTahmin);
        } while (kalanTahmin > 0);

        if (kalanTahmin==0) {
            System.out.println("malesef bulamadiniz");
        }

    }

    }

