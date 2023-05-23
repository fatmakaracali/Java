package day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {

    public static void main(String[] args) {


        /* asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        1) en az 8 karakter
        2) bosluk icermesin
        3) en az bir tanr buyuk harf olsun
        4) en az bir tane kucuk harf olsun
        5) en az bir tane sembol olsun
        6) en az bir tane rakam olsun
         */
        // pozitif senaryo ==> Ac123?d.  true
        // negatif senaryo ==>Ac123? sd  false
        Scanner input = new Scanner(System.in);
        System.out.println(" en az 8 karakter\n" +
                "         bosluk icermesin\n" +
                "        en az bir tane buyuk harf olsun\n" +
                "        en az bir tane kucuk harf olsun\n" +
                "         en az bir tane sembol olsun\n" +
                "         en az bir tane rakam olsun");

        String pwd = input.nextLine();

        // en az 8 karakter
        boolean krktrSys = pwd.length()>7;

        // space icermesin
        boolean spcOlmamali= !pwd.contains(" ");
        // " " == space karakteri icercontains   !== icermesin

        // en az bir tane buyuk harf olsun

        boolean bykHrfOlmali = pwd.replaceAll("[^A-Z]","").length()>0;

        // en az bir tane kucuk harf olmali

        boolean kckHrf = pwd.replaceAll("[^a-z]","").length()>0;

        // en az 1 tane sembol olsun
        boolean smbl= pwd.replaceAll("[a-zA-Z0-9]","").length()>0;

        // en az 1 tane rakam olsun

        boolean rkmOlmali = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Password Gecerli mi :" +(krktrSys&&spcOlmamali&&bykHrfOlmali &&kckHrf&& smbl&&rkmOlmali) );

       // Methodlari yan yana yazabiliriz. Buna method chain( method zinciri) denir

    }
}
