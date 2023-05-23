package SSG_List;

import java.util.ArrayList;
import java.util.List;

public class C03 {

    public static void main(String[] args) {

        /*
        bir dogal sayi listesi olusturun ve bu listteki elemanlari toplayin
         */

        List<Integer>sayilar = new ArrayList<>();

        sayilar.add(36);
        sayilar.add(34);
        sayilar.add(26);
        sayilar.add(16);

        int sum =0;
        for (Integer a: sayilar) {

            sum +=a;
        }
        System.out.println(sum);  //112

    }
}
