package day_07_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {

    public static void main(String[] args) {

        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[4];




        for (int i = 0; i <4 ; i++) {
            System.out.println("Bir rakam giriniz");

            int rakam = scan.nextInt();

            arr[i]=rakam;


        }
        System.out.println(Arrays.toString(arr));

        double toplam =0;

        for (int aech : arr){
            toplam= toplam + aech;

        }

        double ortalama = toplam/arr.length;

        System.out.println(ortalama);

        for (int each : arr){

            if (each>ortalama){
                System.out.println(each + " ");

            }
        }
    }
}
