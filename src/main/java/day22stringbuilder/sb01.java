package day22stringbuilder;

public class sb01 {

    public static void main(String[] args) {

        /*
        1) "StringBuilder" String ureten bir Class'tir.
        2)"String" Class kullanarak String uretiriz. Java nicin "StringBuilder" Class'i olusturdu?
        "String" Class "immutable"(degistirilemez) String uretir. "StringBuilder"Class"mutable"(degistirilebilir)
        String uretir.
        3) "immutable" olmak demek orijinal degerin korunmasi, degistirilemez olmasi demektir
        "mutable" olmak demek orijinal degerin degistirilebilir olmasi demektir.
        4) capacity , Java'nin size verdigi data depolama yer sayisidir.
        length ise size verilen data depolama yerinin kullanilan kismidir
        5) Java baslangicta size capacity'i 16 olarak verir. siz verilen capacity'i asarsaniz Java yeni
        capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir

         */

        String s ="Java";
        s = s +"!";   // java degistirmez ama istersen sen degistirebilirsin

        String u = "Apex";
        String v = "Apex";
        String y = "C++";


        //StringBuilder nasil olusturulur?
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);   //Python

        t.append("!");
        System.out.println(t);  //Python!

        //StringBuilder'a nasil ekleme yapilir?
        t.append("!").append("...");
        System.out.println(t);  //Python!!...

        //2.yol
        StringBuilder r = new StringBuilder();

        r.append('c');
        System.out.println(r);

        //capacity ve length arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity=  sb1.capacity();
        System.out.println(capacity);    //21

        int length= sb1.length();
        System.out.println(length);     //5

        sb1.append("!").append(".................");
        System.out.println();

        int c =sb1.capacity();
        System.out.println(c);  //44

        int ln = sb1.length();
        System.out.println(ln);  //23

        //Default capacity'i degistirebilir miyiz?

        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());  //2

        sb2.append("...");
        System.out.println(sb2.capacity());  //6







    }
}
