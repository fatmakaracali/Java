package ReplitDeneme;

import java.util.Scanner;

public class kahve1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Kahveyi istersiniz? 1.Türk kahvesi  2.Filtre Kahve  3.Espresso");
        int khv = input.nextInt();
        String hangiKahve = "Turk Kahvesi";
        switch (khv){
            case 1:
                System.out.println(hangiKahve.toLowerCase()+"niz hazirlaniyor");
                break;
            case 2:
                hangiKahve="Filtre Kahve";
                System.out.println(hangiKahve.toLowerCase()+"niz hazirlaniyor");
                break;
            case 3:
                hangiKahve="Espresso";
                System.out.println(hangiKahve.toLowerCase()+"nuz hazirlaniyor");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız");
        }
        System.out.println("----------------------------------");

        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):" );
        String sut = input.next();

        if (sut.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor");
        } if (sut.equalsIgnoreCase("hayir")){
            System.out.println("Süt eklenmiyor");
        }

        System.out.println("----------------------------------");

        System.out.println("Seker ister misiniz ? (Evet veya Hayır olarak cevaplayınız):" );
        String seker = input.next();

        if (seker.equalsIgnoreCase("evet")){
            System.out.println("Kaç şeker olsun?");
            int kacSeker = input.nextInt();

            System.out.println(kacSeker + " seker ekleniyor");
        } if (seker.equalsIgnoreCase("hayir")){
            System.out.println("Seker eklenmiyor");
        }

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.");
        input.nextLine();
        String boyut = input.nextLine();


        switch (boyut.toLowerCase()){
            case "buyuk boy":
                System.out.println(" Kahveniz "+boyut+ " olarak hazirlaniyor");
                break;

            case "orta boy":
                System.out.println(" Kahveniz "+boyut+ " olarak hazirlaniyor");
                break;

            case "kucuk boy":
                System.out.println(" Kahveniz "+boyut+ " olarak hazirlaniyor");
                break;

//            default:
//                System.out.println("Lutfen gecerli bir boyut giriniz");
        }

        System.out.println(hangiKahve+"niz "+boyut+ " hazirdir. Afiyet olsun" );

    }//mai
}
