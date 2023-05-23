package day08stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {

        //*******replacefirst********
        // replace () ile ayni isi yapiyor. Ancak ilk gordugu datayi degistiriyor.
        String str ="Hayirli olsunda";


        // EX : str String'indeki ilk gorunen "a"'yi "e" ile degistiriniz

        System.out.println(str.replaceFirst("a", "e"));//Heyirli Olsunda

        String str1 =str.replaceFirst("a", "e");
        System.out.println("str1 = " + str1);

        String str4= "Bizimle Java ogrenmek Cok kolay";

        // i yerine e harfi
        String str5=  str4.replaceFirst("i","e"); //Bezimle Java ogrenmek Cok kolay
        System.out.println(str5);

        // butun i leri e ye cevir
        String str6 = str4.replace("i","e");      // Bezemle Java ogrenmek Cok kolay
        System.out.println(str6);

        //**********trim*******
        // trim () bir String'deki basinda ve sonundaki space karakterlerini siler
        // aradaki spacelere DOKUNMAZ. saclar icin uclardaki kiriklarin aldirilmasi gibi
        // cumledeki spacelerin silinmesi

        // str Stringindeki bas

        String str2 ="     Ali Can   ";
        System.out.print(str2);
        System.out.println("*****");
        String strTrim = str2.trim();
        System.out.print("strTrim = " + strTrim);
        System.out.println("*****");

        String isim = "  Mehmet Fatih Yildirim  " ;
        System.out.print("*****");
        System.out.print(isim);
        System.out.print("****");
        String isim1 = isim.trim();
        System.out.print(isim1);
        System.out.println("*****");


        // asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //String tv = 599.99$  String laptop = 299.992$

        String tv = "599.99$";
        String laptop ="299.992$";

        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);           //     tv2 = 599.99

        String laptop2= tv.replace("$","");
        System.out.println("laptop2 = " + laptop2);    //    laptop2 = 599.99

        System.out.println(tv2+laptop2);               //    599.99599.99  + isareti concatination yapar

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice); //  totalPrice = 1199.98

        // valueof methodu String olan datayi bize sayi haline getirir.

        // verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini buyuk harf olrk ekrana yazdiriniz
        //yan yana yazdiriniz


        String tamIsim = "  mehmet fatih  ";  //==>MF

        char first = tamIsim.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("second = " + second);   //F

        System.out.println("ILK HARF SON HARF =" +first+second);
        System.out.println(first+second);  // String almadigimiz icin Ascii degerini verir yani toplar 147


        String str3="  mehmet fatih yildirim";
        char first2 = str3.trim().toUpperCase().charAt(0);
        char second2 = str3.trim().toUpperCase().split(" ")[1].charAt(0);
        char third = str3.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println(" Ilk harf son harf: "+first2+second2+third);//MFY








    }
}
