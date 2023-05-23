package day27interface;

/*1) "interface" icine "concrete method" konulamaz.
  2) "interface" icindeki methodlarin abstract oldugunu java bilir. bu yuzden
  interface icindeki abstract methodlarda abstract keyword kullanmaya gerek yoktur
  3)"interface" deki butun abstract methodlar public'tir.
  bu yuzden interface icinde  abstract method olusturulurken "access modifier" yazmaya gerek yoktur
  4)bir interface'i bir "class"in parent'i yapmak istedigimizde extends keyword'u yerine "implement" keyword
  kullaniniz
  5)"Concrete child class'lar" parent interface'deki abstract methodlari override etmek zorudadir
  6)"INTERFACE"LER BIR APPLICATIONDA "Concrete child class"larin yapmak zorunda olduklari fonksiyonlari barindirirlar
  bu yuzde "interface"lere "to-do list" de denir.
  7)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabilirsiniz
  abstract methodlarin body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi birini override ederek
  kullanabilirler
  8)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturdugunuzda bu method'larin "return type"
  lari ayni olmak zorundadir
  9) Normalde interface icine concrete method konulamaz. ama bazi ozel durumlarda concrete method koymamiz gerekirse
  "default" keyword'unu asagidaki gibi kullanarak interface icine concrete method koyabiliriz
       i)default void eco(){
          System.out.println("Uses gas less...");
    static keyword'u ile de yapabilirirsiniz

       ii)    static void stop(){
       System.out.println("Stop securely..");
   10) default veya static keyword'unu kullanarak olusturdugunuz concrete method'larin, "concrete child class,lar
   tarafindan kullanilma zorunlulugu yoktur
   11)default keywordu'unu kullanarak olusturdugunuz "concrete method'lara "object" olusturarak ulasilabilir
   "static" keyword'unu kullanarak olusturdugunuz "concrete methodlara ulasmak icin "concrete methodla"ra ulasmak icin "object" olusturmaya gerek yoktur
   "interface" ismi yeterlidir.
   12) Interface 'lerden object olusturulamaz.method'larin body'si yarim dir. yarim obje olusur
   interface'lerin "constructor'i yoktur







 */

public interface Engine {

    /*  Interface'deki methodlar
    Bir interface kesinlikle abstract method kullanmalidir
    "interface" icinne concrete method konulamaz
    2)interface icindeki method'larin abstract oldugunu Java bilir
    bu yuzden "interface" icindeki "abstract method"larda abstract keyword
    kullanmaya gerek yoktur
    3)interface icindeki abstract methodlarin tamami "public"tir
    bu yuzden "interface" icinde abstract method olusturulurken "access modifier"
    yazmaya gerek yoktur
    4) bir interface'i bir class'in parent'i yapmak istedigimizde "extends"
    keyword yerine "implements" keyword kullaniriz
    5)concrete child class'lar "parent interface"deki abstract method'lari override etmek zorundadirlar
    6) "interface"ler bir applicationda "concrete child class'larin yapmak zorunda olduklari fonksiyonlari
    barindirirlar.Bu yuzden "interface'lere "to do list" de denir
    7) birden fazla " parent interface icinde ayni isimli abstract methodlar olusturabiliriz. abstract method'larin
    body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi birini override ederek kullanabilir
    8) birden fazla " parent interface icinde ayni isimli abstract methodlar olusturdugunuzda bu methodlarin r
    return type'lari ayni olmak zorundadir
    9) normalde interface icine concrete method konulamaz- ama bazi ozel durumlarda concrete method koymamiz
    gerekirse asagidaki gibi
        i)"default" keyword'unu asagidaki gibi kullanarak "interface" icine "concrete method"
    koyabiliriz
          default  void eco(){
          System.out.println("Uses gas less...");

        ii)"static" keyword'unu asagidaki gibi kullanarak "interface" icine concrete method koyabiliriz.

          static void stop(){
          System.out.println("Stop securely..");
       10) default veya static keyword'unu olusturdugunuz concrete method'larin , "concrete child class'lar tarafindan
       kullanilma zorunlugu yoktur

       11) default keyword'unu kullanarak olusturdugunuz "concrete method"lara "object" olusturarak ulasilabilir
           static  keyword'unu kullanarak olusturdugunuz "concrete method"lara ulasmak icin  "object" olusturmaya
           gerek yoktur, "interface " ismi yeterlidir
       12) interface'lerden object olusturulamaz.interfacelerin constroctur'i yoktur. cunku bu methodlar yarimdir.







     */


      void start();
      void payment();

      default void eco(){
          System.out.println("Uses gas less...");
      }

      static void stop(){
          System.out.println("Stop securely..");
      }

}
