package introduction;

public class MethodCreation01{
    /* javada temelde iki tip data vardir.
    1) primitive:
    char,boolean,byte,short,long,float,double
     2)non-primitive:
      String
      note 1)primitive data type lari java olusturur.8 tane data type var
           2) primitive data typelarin isimlerinde sadece kucuk harf kullanilir.
           3)primitive datalar typelarina gore memoryde farkli yer kaplarlar.
    //     4)
    /*Non-primitive Data type
    note   1) uretilen her bir class ayni zamanda bir non-primitive data type tir.
           2)bu yuzden non-primitive data type lar sinirsiz sayidadir
           3) non-primitive data type larin isimleri buyuk harfle baslar
           4) non-primitive data type larin tamami icin java memoryde ayni miktarda yer kaplar.
     */

     /* interview sorulari : primitive ve non-primitive arasindaki farklar
        1) primitive ler sadece bizim atadigimiz degerleri icerir.
         non-primitive ler bizim atadigimiz deger ve methodlar icerir
        2) primitive ler kucuk harfle baslar. non-primitive ler buyuk harfle baslar.
        3) primitive leri java uretmistir ve 8 tanedir.
        4) primitive ler memoryde data type ina gore yer kaplar
           non-primitive data type larin tamami icin java, memoryde ayni miktarda yer kaplar.


  */




    // javada Method nasil olusturulur
    //1) main methodun disinda olusturulur
    //2) access modifier + return type + method ismi + () + {}

    // main method nasil olusturulur
    // main method un icinden kullanilir
    // methodun ismi + ()
    //islem yapacaginiz parametreler parantezin icine koyulur

    // main method static oldugu icin main method icinde kullanacaginiz hersey static olmalidir.


    public static void main(String[] args) {

      //1)
        int sonuc = toplamaYap(30,60) ;
       System.out.println(sonuc);

       //2)
        int carpmaSonuc = multiply(35,60) ;
        System.out.println(carpmaSonuc);

        // 3)

        int islemSonuc = carpTopla(1,2,6);
        System.out.println(islemSonuc);

       // 4)
        double kupSonucu = kup (3.5);
        System.out.println(kupSonucu);

        //5)
        print("Hello World");



    }


    // ornek 1) toplama islemi yapan bir method olusturunuz.

     public static int toplamaYap(int a, int b){return a+b;}


    // ornek 2) 2 sayiyi carpma islemi yapan bir method olusturunuz

      public static int multiply(int a, int b){return a*b; }

    // 3) verilen 3 sayidan ilk ikisini carp sonuncu ile toplayan bir method olustur

    public static int carpTopla(int a, int b, int c){return a*b+c ;}

    // 4) verilen bir ondalikli sayinin kupunu hesaplayan method olusturunuz.

    static double kup(double a){return a*a*a ;}

    //5) girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    private static void print(String str){System.out.println(str);}





}

