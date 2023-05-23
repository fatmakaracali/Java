package ReplitDeneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestArray8 {

    public static void main(String[] args) {



    /*Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

            Array: [1232,2345,5467,678,3454,2312,3451]*/

        List<Integer> list = new ArrayList<>(List.of(1232, 2345, 5467, 678, 3454, 2312, 3451));

        Collections.sort(list);
        System.out.println(list);  //[678, 1232, 2312, 2345, 3451, 3454, 5467]

        System.out.println(list.get(list.size()-2));  //3454








    }
}