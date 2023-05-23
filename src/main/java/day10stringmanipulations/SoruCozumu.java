package day10stringmanipulations;


import java.util.Scanner;
public class SoruCozumu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String password = scan.nextLine();

        char initial = password.charAt(0);
        if(initial>='A' && initial<='Z') {
            if(initial=='A') {
                System.out.println("Gecerli");
            }else {
                System.out.println("Gecersiz");
            }
        }else if(initial>='a' && initial<='z') {
            if(initial=='z') {
                System.out.println("Gecerli");
            }else {
                System.out.println("Gecersiz");
            }
        }else {
            System.out.println("Bu ne?");
        }
       /* Aşağıdakilerden hangisi Ayanlıştır?
                A) Kullanıcı Ali girerse output Geçerli olur
        B) Kullanıcı cem girerse output Geçersiz olur
        C) Kullanıcı 123 girerse output Bu ne? olur
        D) Kullanıcı B123 girerse output Geçerli olur*/
    }

}
