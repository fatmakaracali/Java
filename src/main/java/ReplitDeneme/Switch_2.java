package ReplitDeneme;

import java.util.Scanner;

public class Switch_2 {

    public static void main(String[] args) {
         /* Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

 Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN  : **** **** **** 1478

* Ilk Harfler Buyuk harf ile baslamalidir. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String t= scan.nextLine().toUpperCase();
        System.out.println("Lutfen kredi kartinizin numarasini giriniz");
        String s= scan.next();


        System.out.println(s.substring(s.length()-3));
    }
}
