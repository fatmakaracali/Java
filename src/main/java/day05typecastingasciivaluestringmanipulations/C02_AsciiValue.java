package day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {
        // javada char data type ini matematiksel islemlerde kullanirsaniz, Ascii table daki sayisal degerleri alir.

        // "A" karakterinin ASCII degerini hesaplatan kodu yaziniz

        // Numeric Data typelari : byte-short-int-long-float-double
        // char karakteri hem sayisal deger barindirir hem de resim barindirir
        // boolean sadece true, false degerini alir

        int asciA = 'A';
        System.out.println(asciA);

        int asciia = 'a';
        System.out.println(asciia);

        int asciiUnlem = '!';
        System.out.println(asciiUnlem);
        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);
        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);


        String isim = "Zeki";
        char isaret = '+';
        char sembol = '-';
        char sembol2 = '*';
        char rakam = '9';

        // '' arasinda tek bir karakter alir. mesela 50 yi almaz. cunku char' a 2 karakter sigmaz
        // Javad  char data type'ina int deger de atanabilir. sembol,harf vs de atanabilir.
        // Cunku char data type'inda Ascii'den gelen bir sayisal=numeric bir degeri vardir.


        int deger = 20;
        char smbl = '$';   //  $  Ascii degerini alir yani 36 yi.  toplam 56
        System.out.println(deger + smbl);

        int deger2 = 0;
        char smbl2 = '+';
        System.out.println("deger2+smbl2 =" +(deger2 + smbl2));

        int asciiG ='G';
        System.out.println("asciiG ="+asciiG);   //G =71


        /*
        Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar
        iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
        Buna "Concatination" denir
        Java metematik bilir islem onceligine gore calisir
        i)Uslu Sayilar
        ii)Parantez ici
        iii)carpma/bolme
        iv) toplama/cikarma  */

        String name = "100";
        int number = 45;
        System.out.println(name+number);//10045 Concatination uc uca ekler yani yan yana yazar

        String str1 = "java";
        char ch3 = 'G';
        int sayi1 =5;

        System.out.println(str1+ch3+sayi1);   // javaG5
        System.out.println(str1+(ch3+sayi1)); //java76
        System.out.println(ch3+sayi1+str1);   //76java islem onceligi
        System.out.println(ch3+str1+sayi1);

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);
        char rakam2= '2';
        System.out.println("rakam2 = " + rakam2);
        char rakam3= '3';
        System.out.println("rakam3 = " + rakam3);
        System.out.println("rakam1+rakam2+rakam3=" +(rakam1+rakam2+rakam3)); // Ascii tabledaki degerleri toplar
        System.out.println("rakam1+rakam2+rakam3 =" + rakam1+rakam2+rakam3); //yan yana yazdirir
        System.out.println(rakam1+rakam2+rakam3);

        int asciiDeger = '4';
        System.out.println(asciiDeger);




        ///****ASCII degerlerinden faydalanilarak neler yapilabilir*****

        byte b = 5;
        char ch2 = 'h';

        int asciih = 'h';
        System.out.println(asciih);

        System.out.println("b> ch=" + (b>ch2));

        long l= 542168784578l;
        System.out.println("ch2>l "+ (ch2>l));

        float f = 2.45648f;
        double d= 2.19658;
        System.out.println(f>d);

        System.out.println("b<f"+ (b<f));

        byte sayi3 = 5;
        byte sayi4 = 4;
        System.out.println(sayi3<sayi4);


        int sayiInt =200;
        long sayiLong = 100L;
        int sayiInt2 = 200;
        System.out.println("sayiInt>=sayiLong:" + (sayiInt>=sayiLong));
        System.out.println("sayiInt>=sayiLong:" + (sayiInt2>=sayiLong));

        int sayiInt3 = 9;
        char sayiChar= '9';
        int asciiDeger2='9';
        System.out.println("asciiDeger2 = " + asciiDeger2);
        System.out.println("sayiInt3>=sayiChar :" + (sayiInt3>=sayiChar ));











    }
}