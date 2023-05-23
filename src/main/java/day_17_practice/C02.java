package day_17_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {

    // Bir tane txt dosyası olusturunuz.
// txt dosyasının icerisine cumleler yazınız
// Olusturdugunuz txt dosyasına ulasınız.
// icerisindeki cumleleri yazdırınız

    public static void main(String[] args)  {


        /*
        Bir kod yazilirken olasi exception'lari öngorup exception olustugunda Java'nin ne yapmasini istedigimize
        karar vermeliyiz.

        1)eger exception olustugunda kodun calismaya devam etmesini istemiyorsak, method isminin yanina olusabilecek
        exception.i deklare ederiz

        2)eger exception olussa da kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try blogunun
        icine yazmaliyiz

        catch bloguna ise exception durumunda Java'nin ne yapmasini istedigimizi yazmaliyiz





         */


        String dosyaYolu ="src/main/java/day_17_practice/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            int k=0;

            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
/*
exceptionlar icin parent-child iliskisi mevcuttur.
 eger bir kod icin birden fazla exception olusma ihtimali varsa
oncelikle olasi exception'lar parent -child iliskisi tasiyor mu ,bakmamiz gerekir.
 eger parent-child iliskisi yoksa
istedigimiz sirada try-catch cumleleri olusturabiliriz

eger parent-child iliskisi varsa sadece parent exeption'i yazailiriz veya ikisini de yazmak istersek child'i once
parent'i sonra yazmaliyiz


 */