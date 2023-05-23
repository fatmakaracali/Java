package Day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //java bu satiri okumaz. kendimize veya baskasina aciklamadir.

        //Variable olusturma
        // data type + variable name + atama operatoru + noktali virgul
        //java cumlesi == statement
        // eger variable declaration yapar, assignment yapmazsaniz Java kendi degerini(default) koyar}
        // Default degerler, sayilar icin sifirdir.
        // dilbilgisindeki nokta ne ise javadaki noktali virgul ayni seydir ve statementin bittigini gosterir.
        // Javadaki esittir demek ==

        /* Javada temelde iki tip data vardir.
        1) primitive data type
           char, boolean, byte, short, int, long, float, double
        2) non-primitive data type
           String

           Ornek ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz */

        String studentName = "Ali Can";
        // Stringlere verilen degerler cift tirnak icinde kullanilmalidir.

        // String bir variable olusturup ona herhangi bir atama yapmazsak, java o variablea default
        //  olarak "null" koyar. Null, sifir demek degil, ici bos obje demektir.

        // char data type : tek karakterler icindir.ornegin A, x, ?, 3

        // char data type inda bir ismin ilk harf olarak bir variable olusturunuz ve bir deger atayiniz

        char isminIlkHarfi = 'A';

        // boolean data type : booleanlar sadece iki farkli deger alir
        // true ya da false

        // ornek: boolean data type inda emeklimisin icin bir variable olusturun ve

        // false degerini atayin

        boolean emeklimisin = false;

        //byte data type :tam sayilar icindir.1 byte yer kaplar.

        // byte -128 +127 ye kadar tamsayi degerleri icin kullanilir.
        // ornek : byte data type inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz

        byte ogrenciYasi = 23;

        //Short data type : tam sayilar icindir.Hafizada 2 byte yer kaplar.
        // short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir.
        // ornek : short data byte inda site nufusu icin bir variable olusturun ve deger

        short SiteNufusu = 16789;

        //int data byte : tamsayilar icindir. 4 byte yer kaplar.
        // -2,147, 483,648 ile 2,147,483, 647 arasindaki sayilar icindir.
        // ornek ulke nufusu
        int ulkeNufusu = 80000000;
        int countryPopulation = 150000000;

        // long data type : tam sayilar icindir.hafizada 8 byte kaplar.
        // long -9,223,372,036,854,775,808 ile 9,223,372,036, 854,775,807 araliginda
        long cellNumberInHumanBody = 100000000000L;

        //bir deger long ise sonuna L(tercih edilir) veya l konulur.

        //eger longa atadiginiz deger intlerin araliginda ise sonuna 'l' koymaya gerek yok.
        // long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int
        // kabul eder.


        // float data byte: virgullu sayilar(decimal numbers) icin.ondalikli sayilar
        // fiyatlandirmalar icin olabilir.
        //java ondalikli sayilari( decimel numbers) otomatik olarak double kabul eder.
        // eger float data type olmasinda israr ederseniz sonuna F ya da f koymalisiniz.


        float gomlekFiyati = 12.99F;
        float ayakkabiFiyati = 15.99F;

        System.out.println(gomlekFiyati + ayakkabiFiyati);


// system.out.println(); yazdirmanin kisayolu sout yaz ve enter


// println ekrana yazdirir ve pointer bir sonraki satira kayar
// print ekrana yazdirir ama ayni satirda tutar.

// double data type: virgullu sayilar icindir.
// double, memoryde daha fazla yer kaplar.virgulden sonraki rakam daha fazla olur

// ornek: hucre agirligi ve amipin agirligi  icin iki tane variable olusturunuz ve farki console yazdir


        double weightAmip = 0.1238789900018000 ;
        double weightCell = 0.23658028004750000;
        System.out.println(weightAmip - weightCell);


    }
}
