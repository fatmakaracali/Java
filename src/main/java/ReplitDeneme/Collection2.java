package ReplitDeneme;

import java.util.ArrayList;

public class Collection2 {

    /*
    Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array elemanlarını ekleyen java kodunu yazınız.
Array List:  siyah,mavi,kirmizi,beyaz
en başa: **pembe**
mavi-kirmizi arasına **yesil**  renk eklenecek.
Beklenen Çıktı:
```
```
     */

    public static void main(String[] args) {

        ArrayList<String> words= new ArrayList<>();

        words.add("siyah");
        words.add("mavi");
        words.add("kirmizi");
        words.add("beyaz");
        words.add(2,"yesil");
        words.add(0,"pembe");

        System.out.println(words);

    }

}
