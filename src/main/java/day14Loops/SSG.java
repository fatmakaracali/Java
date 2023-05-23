package day14Loops;

import java.util.Scanner;

public class SSG {
    public static void main(String[] args) {

        //Ekrana 10 kez "Java guzeldir"

      /*  for (int i = 0; i < 10; i++) {
            System.out.println("Java guzeldir");

        }
        //10 ile 30 arasindaki sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i < 31; i++) {
            if (i < 30) {
                System.out.print(i + " , ");
            } else System.out.print(i);

        }

        // 100'e kadar olan tek ve cift sayilari iki ayri dongu ile yazdirin
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }

        // 100'den aslayarak 50'ye (dahil) kadar olan sayilari aralarinda virgul olarak ayni
        //satirda yazdirin

        for (int i = 100; i > 49; i--) {
            if (i > 50) {
                System.out.print(i + ",");
            } else System.out.print(i);

        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("100 DEN KUCUK IR SAYI GIRINIZ");

        int sayi = input.nextInt();

        if (sayi>=0&& sayi <= 100) {
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }

            }

        } else {
            System.out.println("lutfen");
        }

        int sum =0;
        for (int i = 578; i > 0;  i /= 10) {

            sum =sum+ i%10;
            System.out.println(sum);
        }

    }}