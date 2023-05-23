package day08stringmanipulations;

import java.util.Scanner;

public class C03_Mail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi  \n" +
                " i)mail adresi \"gmail\" icermeli\n" +
                " ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                " iv)En az bir tane noktalama isareti bulunmali \n seklinde veriniz");




        String email = input.nextLine();

        boolean first = email.contains("gmail");
        System.out.println("gmailVar = " + first);

        boolean second = !email.contains(" ");
        System.out.println("spaceYok = " + second);

        boolean third = email.replaceAll("[a-z0-9]","").replaceAll("[\\p{Punct}]","").
                replace(" ","").length() == 0;
        System.out.println("upperCase = " + third);

        boolean fourth = email.replaceAll("[a-zA-Z0-9]","").replace(" ", "").length()>0;
        System.out.println("fourth = " + fourth);

        boolean fourth1 = email.replaceAll("[^\\p{Punct}]","").length()>0; //[^\p{Punct}] semboller haric herseyi sil
        System.out.println("fourth1 = " + fourth1);

        boolean fourth2 = email.replaceAll("[\\P{P}]","").length()>0; //[\P{P}] semboller haric herseyi sil
        System.out.println("fourth2 = " + fourth2);

        System.out.println(first && second && third && fourth);
    }
}
