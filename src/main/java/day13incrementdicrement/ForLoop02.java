package day13incrementdicrement;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {

        // Verilen bir String'de ilk 'a' harfinden onceki tum karakterleri konsole'a yazdiriniz

        String s = "I love Java";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {                     //char ch = s.charAt(i);
                                                           //if(ch=='a'{break;}
                                                          //sout.ch
                break;
            }
            System.out.print(s.charAt(i));
        }
        // Verilen bir String de son 'a'dan sonraki tum characterleri ters sirada yazdiriniz
        // Germany ==> yn
        String t = "Germany";  //yn
        for (int i = t.length() - 1; i >= 0; i--) {

            if(t.charAt(i)=='a')break;{                   //char ch=t.charAt(i);
                System.out.println(t.charAt(i));}         //if(ch=='a'){break}
        }                                                   //sout.ch


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir isim yaziniz");
        String k = input.next();
        String l="";

        for (int i=k.length()-1 ; i>=0 ; i--) {

            l = l + k.substring(i,i+1);


        }
        System.out.println(l);


        System.out.println("Lutfen iki sayi giriniz");
        int b = input.nextInt();
        int c = input.nextInt();
        int sum = 0;

        for (int i = b ; i<c+1; i++) {

            sum = sum + i;


        }
        System.out.println(sum);


}
}
