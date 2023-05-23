package day09_stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {


        // bir String'in hic karakter icerip icermedigini kontrol eden kodu yaziniz

        String str ="";  // hiclik

       // 1.yol
        boolean result1 = str.length()==0;  // javada iki islem yaptik.1) lenght  2) ==0
        System.out.println("String bos mu? = " + result1);

        //2.yol  ***************isEmpty*************
        boolean result2 = str.isEmpty();
        System.out.println("result2 = " + result2);  // javada 1 islem yaptik  isEmpty methodu

        // isEmpty methodu datanin icinde bir sey yoksa true dondurur.
        // javada space de bir karakter old icin space varsa false dondurur.
        // sadece hiclik icin true dondurur.

        // bir String'in space haric hicbir karakter icerip icermedigini gosteren kodu yaziniz

        String t = " ";

        // 1.yol
        Boolean result3 = t.replace(" ","").length()==0;
        System.out.println("result3 = " + result3);

        //2.yol

        boolean result4 =t.replace(" ","").isEmpty();
        System.out.println("result4 = " + result4);

        // 3.yol *************isBlank************
        // isBlank==> space+hiclik ise True dondurur
        // String bir datanin dolu mu olduguna bakar. isEmpty'den farki space varsa yine true dondurur
        // space varsa isBlank bos der. isEmpty bosdegil der

        boolean result5= t.isBlank();
        System.out.println("result5 = " + result5);


        // *******indexOf*******
        //Verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        // int bir deger dondurur
        // coklu data icin kullanildiginda ilk gordugu datanin ilk gordugu datanin ilk karakterini dondurur

        // bir Stringde a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrarna yazdiriniz

        String s= "Java is easy to learn";  // 1 +5  + 8 = 14
        int aIdx = s.indexOf('a');
        System.out.println("aIdx = " + aIdx);    //aIdx = 1

        int iIdx = s.indexOf('i');
        System.out.println("iIdx = " + iIdx);    // iIdx = 5

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx);    //  eIdx = 8

        System.out.println("indexler toplami :" +(aIdx+iIdx+eIdx) );  //  indexler toplami :14

        int paIdx = s.indexOf('p');
        System.out.println("paIdx = " + paIdx);  // olmayan karakter sorgulanirsa -1 dondurur

        
        String s2 = "Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idx = " + idx); // 13

        // Bir String'de Java kelimesinin ilk olarak kacinci indexte  oldugunu gösteren kodu yaziniz

        String cumle = "Ah Java vah Java sen ne guzel seysin Java ";
        int indexJava = cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava);    // indexJava = 3


        int indexQYX = cumle.indexOf("QYX");
        System.out.println("indexQYX = " + indexQYX);      // indexQYX = -1 olmayan krktr'i -1 döndurur

        //*********lastIndexOf()************
        // Verilen String bir datada istenilen degerin son gorunumunun indexini verir
        // olmayan bir karakter sorgulanirsa -1 döndurur.

        // // bir Stringde a,i,e karakterlerinin son gorunumunun indexleri toplamini ekrarna yazdiriniz

        String c= "Java is easy to learn";

        int aSon =c.lastIndexOf('a');
        System.out.println("aSon = " + aSon);  //aSon = 18

        int  iSon = c.lastIndexOf('i');
        System.out.println("iSon = " + iSon);  //iSon = 5

        int eSon =c.lastIndexOf('e');
        System.out.println("eSon = " + eSon);  //eSon = 17

        System.out.println("eSon+iSon+aSon = " +( eSon+iSon+aSon)); //eSon+iSon+aSon = 40






    }
}
