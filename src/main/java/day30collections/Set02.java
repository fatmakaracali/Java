package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {

        // ogrenci email adreslerini  Natural order'da siralanmis olarak depolayiniz  INTERVIEW

        //1.yol
        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();

        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("alc@gmail.com");

        System.out.println(emails);

        //2.yol
        long t2= System.nanoTime();

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("alc@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        long t3= System.nanoTime();


        System.out.println(t2-t1);//TreeSet
        System.out.println(t3-t2);//HashSet

    }
}
