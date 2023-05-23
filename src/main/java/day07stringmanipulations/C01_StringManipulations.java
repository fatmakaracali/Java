package day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        /**************endswith*******

         *endWith () : Metnin belirli bir datayla bitip bitmedigini verir.
         * Bize boolean dondurur.
         * tek karakterde de, coklu karakterde de kullanilir

         */

        // s String'inin "money" ile bitip bitmedigini kontrol ediniz

       boolean isEnd = s.endsWith("money");

        System.out.println("isEnd = " + isEnd);




        //replace() : Metnin icindeki belirli bir datanin yerine verilen diger datayi yerlestirir
        // Bize String bir data döndurur.

        // tekli(char) karakterler ile de coklu String karakterler ile de calisir.
        // ancak her iki tarafta da cift tirnak ya da tek tirnak kullanilmalidir.


        // s String'indeki "money" kelimesini "dolar" kelimesi ile degistiriniz

        String s1=  s.replace("money","dolar");
        System.out.println("s1 = " + s1);



        // s String'indeki "learn" kelimesini "win" kelimesine ceviriniz

        String s2 = s.replace("earn","win");
        System.out.println("s2 = " + s2); // Lwin Java win money



        // s String'indeki "a" harflerini yildiz ile degistiriniz

         String s3 = s.replace("a","*");
        System.out.println("s3 = " + s3);

        System.out.println("s3.replace('a','*') = " + s3.replace('a', '*'));



        // s String'indeki "n" harflerini "***" olarak degistiriniz

       /* String s4 = s.replace("n","***");
        System.out.println("s4 = " + s4);*/

        String s4 = s.replace("n","***");
        System.out.println("s4 = " + s4);


        // tum "e" harflerini siliniz

        String s5= s.replace("e","");
        System.out.println("s5 = " + s5);




        // char data type'inin icine mutlaka bir karakter yerlestirilir.space bir karakterdir.
        //ancak hiclik javada char icin kullanilamaz.
        //

        //String s6= s.replace('e','')
        //   bu nedenle silme islemi yaparken mutlaka String kullanmaliyiz

        // ****replaceAll***********'
        String t = "Yucel 25 ya$indadir sandik ama 30'mis!";

        // tum rakamlari "*" a ceviriniz

        String t1= t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);



        //En cok kullanilan Regexler
        // 1) tum rakamlar ==>[0-9]
        // 2) tum kucuk harfler ==>[a-z]
        // 3) tum buyuk harfler ==>[A-Z]
        // 4) tum harfler ==> [a-zA-Z]
        // 5) tum harfler ve rakamlar ==> [a-zA-Z0-9]
        // 6) tum noktalama isaretleri ==> \\p{Punct}
        // 7) tum sesli harfler ==> [aeiouuAEIOU]


        //
        //1) tum rakamlar haric==>[^0-9]
        // 2) tum kucuk harfler haric ==>[^a-z]
        // 3) tum buyuk harfler haric==>[^A-Z]
        // 4) tum harfler haric ==> [^a-zA-Z]
        // 5) tum harfler ve rakamlar haric==> [^a-zA-Z0-9]
        // 6) tum noktalama isaretleri haric ==> ^\\P{P}  ya da [^\\p{Punct}]
        // 7) tum sesli harfler haric ==> [^aeiouAEIOU]

        // t String'indeki tum harfleri ve tum rakamlari ! e ceviriniz

       String t2= t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t2 = " + t2);  //t2 = !!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!!



        // t String'indeki tum spaceler disindaki karakterleri + ya dönusturunuz

        String t3 =t.replaceAll("[^ ]","+");
        System.out.println("t3 = " + t3);  // t3 = +++++ ++ ++++++++++ ++++++ +++ +++++++


        String t4 = t.replaceAll("[^a-z]","?");
        System.out.println("t4 = " + t4);   // t4 = ?ucel????ya?indadir?sandik?ama????mis?




        // tum sesli harfler disinda & ye cevir
        String t5 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5);  //&u&e&&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&i&&




    }
}
