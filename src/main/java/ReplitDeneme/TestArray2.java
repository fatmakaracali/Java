package ReplitDeneme;

public class TestArray2 {
    public static void main(String[] args) {
       /* Array deki sayıları tolpayan Java kodunu yazınız.

       array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Beklenen Çıktı:
```Array toplamı: 55*/

        int [] arr={1,2,3,4,5,6,7,8,9,10};

        int toplam =0;

        for (int w: arr) {
            toplam += w;

        }
        System.out.println("`Array toplamı: "+ toplam);


    }
}
