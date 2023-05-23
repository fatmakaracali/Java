package SSG_List;

import java.util.ArrayList;
import java.util.List;

public class C05 {

    /*
    verilen bir listede tekrar eden sayilari sadece 1 tane yapan bir method olusturn
     */

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(tekrarsizOlustur(sayilar));  //[1, 3, 5, 6, 7]

    }

    public static List<Integer> tekrarsizOlustur(List<Integer>x) {

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < x.size(); i++) {
            if (!tekrarsizList.contains(x.get(i))) {

                tekrarsizList.add(x.get(i));

            }
        } return tekrarsizList;
    }
}
