package day18constructorsstatickeyword;


/*
1)Constructor nasil olusturulur?
2)Method ile constructor arasindaki farklar nelerdir

i) methodlarda return type olur, constructorlarda olmaz
ii)methodlar yaptiklari ise gore isimlendirilirler(carpma islemi yapacaksa carpma deriz), constructorlar ise her zaman
class ismi ile isimlendirilir
iii)methodlar bir aksiyon yapmak icin olusturulur,constructorlar ise object olusturmak icindir
iii)method isimleri kucuk harfle baslar, constructor isimleri class ismi ile ayni oldugu icin buyuk harfle baslar

3) Parametreli constructorlar olusturarak ayni class'tan farkli ozelliklere sahip object'ler olusturabiliriz


  Access modifier + class ismi +() + {}


 */


public class Car {


    String make="Honda";
    String model="Accord";
    int year=2021;
    int price=18000;

    //Default Constructor:
    //Default Cunstructor'lar "parametre" kullanmazlar
    //Default constuctorlarin body'si bostur
    //Java kiskanctir. Siz default consructor'i elle yazdiginizda  Java object class icindeki default constructori
    // kullandirtmaz.
    public Car (){

    }

    public Car(int price) {
    }

    //Custom Constructor
    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }

    public Car(String make) {
        this.make = make;




    }




}
