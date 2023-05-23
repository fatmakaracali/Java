package day09_stringmanipulationsifstatement;

public class Denemeler {

    public static void main(String[] args) {

        String str ="p";
        boolean str1 = str.isEmpty();
        System.out.println("str1 = " + str1);

        String str2= "h";
        boolean str3=str2.isBlank();
        System.out.println("str3 = " + str3);

        String cumle = "Java calisiyoruz  cok";
        // a,i index degerleri toplami
        int aIndx= cumle.indexOf('a');
        System.out.println("aIndx = " + aIndx);
        int iIndx = cumle.indexOf('i');
        System.out.println("iIndx = " + iIndx);

        System.out.println("toplam =" +(aIndx+iIndx));

        int kelime =cumle.indexOf("cok");
        System.out.println("kelime = " + kelime);

        int a= cumle.lastIndexOf('i');
        System.out.println("a = " + a);





    }
}
