package ReplitDeneme;

import java.util.Scanner;

public class Replit {

    public static void main(String[] args) {

   /*     Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

 Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN  : **** **** **** 1478

* Ilk Harfler Buyuk harf ile baslamalidir.

                Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String t= scan.nextLine().toUpperCase();
        System.out.println("Lutfen kredi kartinizin numarasini giriniz");
        String s= scan.next();

        char name = t.substring(0,1).replaceAll;
        char surname = t.charAt(t.indexOf(" ")+1); */

        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT      :

25

46

OUTPUT :

Numaralarin Toplami:

71
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();

        Math.abs(s1);
        Math.abs(s2);

        int r = s1 + s2 ;

        if (r<1000000000){

            System.out.println("Numaralarin toplami: " +
                    ": "+ r);
        } else {
            System.out.println("OverFlow");
        }

        /*
        Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,

"Talebiniz işleniyor" mesajı yazdırılır

yanıt b ise,

"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
yanıt c ise,

"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

başka herhangi bir yanıt değeri için,

"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char ch= input.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b' :
                System.out.println("Yine de ilgilendiginiz icin tesekkur ederiz");
                break;
            case'c'  :
                System.out.println("Gecersiz giris, lutfen tekrar dneyin");
                break;
        }









    }
    }

