package SSG_List;

import java.util.ArrayList;
import java.util.List;

public class C01 {

    public static void main(String[] args) {

        /*
        bir list olusturup eleman ekleyin ve yazdirin
         */

        List<Integer> myList = new ArrayList<>();

        myList.add(15);
        myList.add(32);
        myList.add(19);

        System.out.println(myList);

        myList.add(2,27);    //ikinci indexi degistirdik
    }
}
