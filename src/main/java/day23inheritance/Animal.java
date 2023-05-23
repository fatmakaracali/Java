package day23inheritance;

public class Animal {
    /*
    1) eat(){} methodu gibi bir cok class'in kullanmasi gereken methodlari her class'a ayri ayri yazarsak;
       i)Tekrar yapmis oluruz, tekrar ideal code'da olmamalidir
       ii) Ayni method'u tekrar tekrar yazmak zaman kaybidir
       iii) Tekrar tekrar yazilan method'un tamiri zaman alir
       iiii) Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir
       v) Method'u tekrar tekrar yazmak "otomatik yapiya" terstir
       2) private class member'lar child class'lar tarafindan kullanilamaz
          public class member'lar child class'lar tarafindan kullanilabilir
          default class member'lar ayni package'da child class'lar tarafindan kullanilabilir
          protected class member'lar farkli package'de de olsalar child class,lar tarafindan kullanilabilirler
       3) Java'da bir Class'in sadece 1 tane parent'i olabilir.
          Coklu parent'a "Multiple Inheritance" derler, tekli parent'a "Single Inheritance" derler.
          Java "Multi iNheritance"i desteklemez, Java "Single Inheritance" kullanir
       4)  Apartman seklindeki inheritance yapisina "Multilevel Inheritance  denir
          Java "Multilevel Inheritance"i destekler.

          *Javada Object Class tum java classlarin parentidir
          *Javada Object Class haric tum classlarin parenti vardir
          *Javada her classin bir default constructor' vardir. Bu default constructor classin icinde gorunmez cunku default constructor Object
          classin icindedir

          **Child Class'daki constructordan parent classdaki constructor'a gidebilmek icin
          super() kullanilir
          ***Parent class'da birden fazla constructor varsa istenilen constructor ifadesinin icine
          yazilan parametreler yardimi ile secilebilir
     */
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

}
