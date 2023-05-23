package SSG_List;

import java.util.ArrayList;
import java.util.List;

public class C06 {

    /*

   bir listede ortalamanin ustunde olan elementlsayisini bulunuz
     */

    public static void main(String[] args) {

        List<Double> sayilar =new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(4.5);
        sayilar.add(5.4);
        sayilar.add(6.2);
        sayilar.add(10.5);
        sayilar.add(1.1);
        sayilar.add(5.6);

        double toplam =0;
        double ortalama = 0.0;

        for (int i = 0; i <sayilar.size() ; i++) {
            toplam+= sayilar.get(i);
        }
        System.out.println(toplam);  //37.300000000000004

        ortalama = toplam/sayilar.size();
        System.out.println(ortalama);  //4.6625000000000005

        int counter=0;

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i)>ortalama){

               counter++;

            }

        }
        System.out.println(counter);   //4
    }
}
