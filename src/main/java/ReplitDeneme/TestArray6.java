package ReplitDeneme;

public class TestArray6 {
    public static void main(String[] args) {

      /*  Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
                Array: [12,15,43,23,56,76,78,90,77,43]
        Aranan değer:56
```Beklenen Çıktı:
``56 sayısı arrayin 4. elemanı*/

        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};

        int idx = 0;

        int a = 56;

        for (int w : arr) {
            if (w != a) {
                idx++;

            }else {

        System.out.println(a + " sayisi arrayin " + idx + ". elemani");}


    }
}}