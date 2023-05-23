package day_16_practice_ihheritance_overriding;


/*
inheritance variable:olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar yoksa parent'a gider.
ilk uldugu yerden alir

inheritance method: olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.Yoksa parent'a gider.
Buldugu yerden hemen almaz.Override edilmis mi diye kontrol eder.(Constructor class'ina kadar ayni isimde method var mi
kontrol eder.Override edileni alir
 */

public class Corsa extends Opel {

    protected String hiz = "Corsa max 200km hiz yapar";
    protected String yakit = "Corsa benzinli veya elektriklidir";

    protected String model = "Corsa";

    protected void motor() {
        System.out.println("Corsa arabalar, cevreci motor kullanir");
    }

    protected void yakitTuketimi() {
        System.out.println("Corsa 5.6l yakit tuketir");
    }

    protected void vitesSayisi() {
        System.out.println("Corsa 5 viteslidir");
    }

    public static void main(String[] args) {

        Corsa obj1 = new Corsa();

        System.out.println(obj1.hareket);  //Arabalar teker ile hareket eder
        System.out.println(obj1.hiz);   //Corsa max 200km hiz yapar
        System.out.println(obj1.sirketMerkezi); //Almanya
        System.out.println(obj1.yakit);       //Corsa benzinli veya elektriklidir
        System.out.println(obj1.marka);       //Opel
        System.out.println(obj1.model);       //Corsa

        obj1.motor();         // Corsa arabalar, cevreci motor kullanir


        Opel arb2 = new Corsa();
        System.out.println(arb2.hareket);  //Arabalar teker ile hareket eder
        System.out.println(arb2.hiz);      //Opel arabalar max 220 km hiz yapar
        System.out.println(arb2.yakit);    //Arabalar farkli yakitlar kullanabilir
        System.out.println(arb2.marka);    //Opel
        System.out.println(arb2.sirketMerkezi); //Almanya
        //    System.out.println(arb2.model); CTE instance variable'ini parent'larda bulamadi

        arb2.motor();  //Corsa arabalar, cevreci motor kullanir
        arb2.garanti();  //Opel arabalar 2 yil garantilidir
        arb2.yakitTuketimi(); //Corsa 5.6l yakit tuketir
        //  arb2.vitesSayisi();  CTE


        Araba arb3 = new Corsa();

        System.out.println(arb3.hareket); //Arabalar teker ile hareket eder
        System.out.println(arb3.hiz);     //Arabalar motor gucune gore hiz yapar
        System.out.println(arb3.yakit);   //Arabalar farkli yakitlar kullanabilir
        System.out.println(arb3.marka);   //Arabalar uretildikleri markaya sahiptir
      //  System.out.println(arb3.sirketMerkezi);  CTE Araba class'inda yok
      //  System.out.println(arb3.model); CTE

        //method cagirma
        arb3.yakitTuketimi();  // Corsa 5.6l yakit tuketir
        arb3.motor();          //Corsa arabalar, cevreci motor kullanir
      //  arb3.garanti(); CTE
      //  arb.vitesSayisi(); CTE


    }
}