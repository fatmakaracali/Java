package ReplitDeneme;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        /*
        2 kelime oluşturun: isim1 ve isim2

        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1.  isim yaziniz");
        String isim1= scan.next();
        System.out.println("Lutfen 2.ismi giriniz");
        String isim2 = scan.next();

        if (isim1.length()%2==0){

            String ilkYariIsim1 = isim1.substring(0,isim1.length()/2);
            String ikinciyyariisim1= isim1.substring(isim1.length()/2);

            System.out.println(ilkYariIsim1+isim2+ikinciyyariisim1);



        }else{

            System.out.println("isim1, isim2 ye eklenemiyor.");
        }
       /* Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

                INPUT   : Mustafa*/

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = input.next();

        String s= isim.substring(isim.length()-2);

        System.out.println(s+s+s);



    }
}
