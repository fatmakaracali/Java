package ReplitDeneme;

public class TestArray5 {

    /*yazılan değerin array içerisinde arayan Java Kodu yazınız.
Array: [1551,1223,1443,1267,1789,1023,2020]
Aranan Değer:2020
Beklenen Çıktı:**True**
Aranan Değer:2010
Beklenen Çıktı :**False***/

    public static void main(String[] args) {



        int arr[]= new int[]{1551,1223,1443,1267,1789,1023,2020};

        int i = 2020;
        int counter=0;

        for ( int w: arr) {
            if (w == i) {
                counter++;
            }

        }
        System.out.println("**true*");

        int j = 2010;
        int counter1=0;

        for ( int w: arr) {
            if (w!=j)
            counter1++;

        }
        System.out.println(j);









    }
}
