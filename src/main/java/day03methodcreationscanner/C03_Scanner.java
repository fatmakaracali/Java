package day03methodcreationscanner;
import java.util.Scanner;
public class C03_Scanner {


    public static void main(String[] args) {

    /*Scanner input=new Scanner(System.in);
    System.out.println("Lütfen cinsiyetinizi giriniz K/L şeklinde");
    char cinsiyet= input.next().charAt(0);
    System.out.println("cinsiyet = " + cinsiyet);*/


        //kullanıcıya cinsiyetini,adını,memleketini,yaşını,boyunu,
        // ülkesini sevip sevmediğini ,maaşını soran bir program yazınız.

        Scanner input2=new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz kadin ise K erkek ise E harfi giriniz.");
        char gender=input2.next().charAt(0);

        System.out.println("Lütfen adınızı giriniz.");
        String isim=input2.next();


        System.out.println("Lütfen memleketinizi giriniz.");
        String memleket=input2.next();

        System.out.println("Lütfen yasinizi giriniz");
        byte yas=input2.nextByte();

        System.out.println("Lütfen boyunuzu giriniz.");
        short boy=input2.nextShort();

        System.out.println("Lütfen ülkeyi sevip sevmediğinizi yazınız true/false olarak");
        boolean seviyorMu=input2.nextBoolean();

        System.out.println("Lütfen maaşınızı giriniz");
        long maas=input2.nextLong();

        System.out.println("************ Gonul hanım**********");
        System.out.println("gender="+gender+"\nisim = " + isim+"\nmemleket="+memleket
                +"\nyas="+yas+"\nboy="+boy+"\nSeviyor mu="+seviyorMu+"\nmaas="+maas);


    }

}
