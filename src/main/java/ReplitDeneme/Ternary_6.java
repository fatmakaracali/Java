package ReplitDeneme;

import java.util.Scanner;

public class Ternary_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String s= scan.next();

        for (int i = 0; i < s.length(); i++) {

            if ( s.indexOf(i) ==s.lastIndexOf(i)){
                System.out.println("Dizenin benzersiz karakterleri vardir");

            }else{
                System.out.println("isim ayni karakterlere sahiptir");
            }
        }

    }
}
