package day09_stringmanipulationsifstatement;

public class c02_IfStatement {

    public static void main(String[] args) {

        // INTERWIEW QA usa

        // Bir String'deki tekrarsiz karakterleri ekrana yazdiriniz

        // String y="abbccdc";

        String y="aac";    // ekranda c gormeliyiz

        char ch =y.charAt(0);
        if(y.indexOf(ch)==y.lastIndexOf(ch)){
            System.out.println(ch);
    } // if body ikicurly braces aras

        char ch1=y.charAt(1);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);  }

        char ch2=y.charAt(2);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);   }

        //verilen sayi pozitif ise ekrana "Sayi Pozitif" yazdiran kodu yaziniz
        int num=65;
        if(num>0){
            System.out.println("Sayi Pozitif");  }
        // sayi -1 ile 10 arasinda ise ekrana verilen data rakamdir yazdiran kodu yaziniz

        int num2 =33;
        if(num2>-1 && num2<10){
            System.out.println("Verilen data rakamdir"); }


        System.out.println("********");

        // Sayi 3 basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yaziniz
        int num3=-234;
         num3= Math.abs(num3);
         if(num3>99&& num3<1000){
             System.out.println("Verilen Data 3 Basamaklidir"); }




}}
