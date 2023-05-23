package introduction;

public class q01_Variables {
    public static void main(String[] args) {

        //Bir  Variable  baslat
        int age = 32;
        int number = 55;
        String isim = "Ali";
        System.out.println("isim = " + isim);

        System.out.println(age);
        System.out.println("number = " + number);

        // Variable degerini kopyala
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);

        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //ayni satirda coklu variable deklere et.
        int year = 2022, month = 3, day = 15;
        System.out.println("day = " + day);
        System.out.println("year = " + year);
        // Bir variable degerini guncelle.
        year = 2023;
        System.out.println("year = " + year);
        year = year + 1;
        System.out.println("year = " + year);
        // bir veriable baslat
        // bir variable deklere et
        double x;
        // bir variable baslat
        double y = 100.543;
        // baska bir variable baslat
        double z = 43;
        //x degiskenini y degiskeni ile baslat
        x = y;
        //  x degiskenini guncelle guncelle
        x = 3.14;
        // degiskenleri yazdir
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        double a;
        double b = 55.6 ;
        double c = 10 ;
        a = b ;
        a = 15.3 ;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }



}
