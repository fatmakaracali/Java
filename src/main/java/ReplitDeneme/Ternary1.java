package ReplitDeneme;

import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args) {
          /*
    Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary */

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen 3 karakterli bir isim giriniz : ");
        String name = input.next();



        for (int i = 0; i < name.length(); i++) {

            String d = name.substring(i, i + 1);

            d = name.indexOf(d) == name.lastIndexOf(d) ? "Dizenin benzersiz karakterleri var":"Isim ayni karakterlere sahip";


             System.out.println(d);
             break;


    }

    }}