package day18constructorsstatickeyword;

import java.time.LocalDate;

public class StaticNonStaticBlocks {

    /* 1)"static block"lar "static variable'lara "ilk degerlerini atamak(initialize) icin kullanilir
    2) "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block"kullaniniz
    3)"static"  bir variable'a deger atamak icin yazilmais gereken kod main method icine de yazilabilir ama
    "static block" icine yazilan kod "main method" icine yazilan kod'dan once calistirilir.
    4)Bir class'da bir'den fazla static block varsa ustteki once calistirilir.


     */

    // static variable'lar "static block" kullanilmadan da "initialize edilebilir

    public static double pi=3.14;


    public static double e;

    static{
        e=2.17;
    }


    //Statik variable'lar "statik block" kullanilarak da initialize edilebilir
    //asagidaki gibi "statik" bir variable'a deger atamak icin kod yazmaniz gerekirse "statik block" kullaniniz
    public static double price;

    static {
        LocalDate d = LocalDate.now();
        if (d.getMonthValue() == 3) {
            price = 1000;
        } else {
            price = 1200;
        }
    }
}