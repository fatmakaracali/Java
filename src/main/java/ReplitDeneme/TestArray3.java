package ReplitDeneme;

public class TestArray3 {
    public static void main(String[] args) {

       /* Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
Array =  [20, 30, 25, 35, -16, 60, -100 ]
Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0 */


        int arr [] = {20, 30, 25, 35, -16, 60, -100 };

        int toplam =0;

        for (int w:arr){

            toplam += w;
        }
        double ortalama= toplam/arr.length;
        System.out.println("Array Sayılarının ortalaması: "+ ortalama);




    }
}
