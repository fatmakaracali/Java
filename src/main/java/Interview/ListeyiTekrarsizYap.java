package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListeyiTekrarsizYap {

    public static void main(String[] args) {

    //Elinizde bir listeniz var burdaki tekrarlı elemanları silmek istiyorsunuz , ne yaparsınız.

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(8);
        nums.add(7);
        nums.add(-4);
        nums.add(15);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);




       Set<Integer> tekrarsizNumSet = new HashSet<>(nums);
        System.out.println(nums);

        List <Integer > tekrarsizNumList = new ArrayList<>(tekrarsizNumSet);
        System.out.println(tekrarsizNumList);


        //Listenin elemanlarını Collection’lardan olan Set’e atarım.
        // Ancak List’deki elemanlar henüz tekrarlı bir liste halinde olduğu için bu defa Set içinde yer alan
        // tekrarsız elemanların olduğu data’yı yeni bir List oluşturarak bunun içine atar ve
        // kalıcı bir şekilde tekrarsız bir List elde etmiş olurum.

    }
}
