package ReplitDeneme;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

     /*   Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        char ch1= 'a' ;

        String name =“John came late"

        Expected Output:


        Number of a = 2*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = input.nextLine();
        System.out.println("Lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < cumle.length(); i++) {
            char harf= cumle.charAt(i);
            if (harf == ch) {
                counter++;
            }



        }   System.out.println("Number of a = "+counter);

        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
         */

        String str ="Javaisalsoeasy";

        String s="";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (str.indexOf(c)!=str.lastIndexOf(c) && !s.contains(""+c))


                s = s + c;


            }
        System.out.print(" "+s);

        System.out.println();

        int sayi= 6;
        int faktöryel= 1;

        for (int i =1; i<=sayi ; i++) {

            faktöryel= faktöryel*i;

        }
        System.out.println(sayi+"!="+ faktöryel);



        }


    }
