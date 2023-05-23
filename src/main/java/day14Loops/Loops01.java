package day14Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {

        //Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz
        // orta ustu interview sorusu
        // 1838

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter an integer");
        String s = input.next();

        int sum = 0;

        for(int i=0; i<s.length(); i++){

            String d = s.substring(i, i+1);

            if(s.indexOf(d) == s.lastIndexOf(d)){
                sum = sum + Integer.valueOf(d);
            }
        }
        System.out.println(sum);

















        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz
        //Alabala ==> la

        String t = "Alala";
        String result = "";



        for(int i=0; i<t.length(); i++){

            char ch = t.charAt(i);

            if((t.indexOf(ch) != t.lastIndexOf(ch)) && !result.contains("" + ch)){

                result = result + ch;


            }

        }
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            char harf = metin.charAt(i);
            if (harf == 'a') {
                sayac++;
            } else if (harf == 'c') {
                break;
            }
        }

        System.out.println("Metinde " + sayac + " adet 'a' harfi vardır.");

        int arr[]={11,12,13,14};

        System.out.println(arr[arr.length-4]);


        int arr1[]={12,23,12,2,3};






    }
}