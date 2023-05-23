package day_13_practice;

public class C01_StaticKeyword {

    //Bir tane static variable, bir tane instance variable olusturalim bunlarin kullanimini main method icinde gösterelim

   static int sayi1;

   int sayi2;


    public static void main(String[] args) {

        C01_StaticKeyword obj1 = new C01_StaticKeyword();

        C01_StaticKeyword obj2=new C01_StaticKeyword();

        System.out.println(sayi1);  //0

        System.out.println(obj1.sayi2);  //0


        sayi1++;

        obj1.sayi2++;

        System.out.println(sayi1); //1

        System.out.println(obj1.sayi2); //

        System.out.println(obj2.sayi2);  //0

        System.out.println(obj1.sayi1);  //1

        System.out.println(obj2.sayi2);

        obj2.sayi1++;

        obj2.sayi2++;

        System.out.println(obj2.sayi2); //1

        System.out.println(obj2.sayi1);  //2

        System.out.println(obj1.sayi1);  //2

        obj1.sayi1++;

        obj1.sayi2++;

        System.out.println(obj1.sayi2); //2

        System.out.println(obj1.sayi1);  //3

        System.out.println(obj2.sayi2);  //1

        System.out.println(obj2.sayi1);  //3

        System.out.println(sayi1);

        /*
        Bir static variable olustururken class seviyesinde main method uzerinde olustururuz. Ornek static int sayi1;
Bir deger atamasi yapmadik. Deger atamadigimiz iki int variable'imiz var, biri static digeri degil.

Main method icerisinde instance variable'a ulasbilmemiz icin object olustururuz. Ornek:
C01_StaticKeyword obj1= new C01_StaticKeyword();

Iki object olusturduk, obj1 ve obj2
main method icinde variable ismini yazinca ekrana o variable degerini yazdirir.
Static variablelar class'a, instance variable object'e bagli olur.
         */

    }
}
