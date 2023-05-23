package day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a= "Tek rakibim dunku ben";

        String aUpper = a.toUpperCase();
        System.out.println("aUpper ="+ aUpper);

        String aLower = a.toLowerCase();
        System.out.println("aLower="+aLower);

        System.out.println("ilk karakter="+(a.charAt(0)));
        System.out.println("2.karakter= " +a.charAt(2));


        // a String'indekibastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz

         char ilkChar = a.charAt(1);

         char lastSecond = a.charAt(19);

        System.out.println("ilk karakter +sondanikinci karakter ="+ ilkChar+" "+lastSecond);

        // a String'inde bulunan karakter sayisini bulunuz

        //*********lenght()********
        //lenght bize int deger doner
        // lenght 1'den saymaya baslar, 0¨dan degil¨.Ama digerleri gibi bosluklari da sayar

        System.out.println("a.length() = " + a.length());


        //********substring****
        // a String'indeki ilk dort karakteri aliniz aliniz

         String sub1 =a.substring(0,4); // 0 dahil, 4 haric  [0,4) 0,1,2,3 alinir. 4'ten itibaren alinmaz
        System.out.println("sub1 = " + sub1);


        String sub2 =a.substring(4,7);
        System.out.println("sub2 = " + sub2);

        // a String'indeki rakib kelimesini aliniz.

        String sub3 = a.substring(4,9);
        System.out.println("sub3 = " + sub3);

        System.out.println("a.substring(10) = " + a.substring(10));

        // a Stringinde "bim" kelimesinin olup olmadigini kontrol ediniz.

        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi);

        //********startsWith()********
        //a Stringinin "T" harfiyle baslayip baslamadigini kontrol ediniz
        System.out.println("a.startsWith(\"T\") = " + a.startsWith("T"));


        System.out.println("a.startsWith(\"Tek\",3) = " + a.startsWith("Tek", 3));
        // ilk 3 karakteri at, sonrasi "Tek" ile mi basliyor bak.

        // universite numaralari yil+ bolum kodu+giris sirasi olarak duzenlenen bir okulda ogrenci Umranin
        // hukuk fakultesinde okuyup okumadigini gosteren kodu yaziniz.

        String str = "20105501";
        System.out.println("str.startsWith(\"55\",4) = " + str.startsWith("55", 4));


    } }
