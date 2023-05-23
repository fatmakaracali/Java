package day44lambda;

import java.util.*;

public class InterviewQuestion {

    public static void main(String[] args) {

        //Size verilen bir array'in "Mountain Array" olup olmadigini gosteren kodu yaziniz
        // [0,2,5,3,1,-1]

        int[] arr ={0,2,5,3,1,-1 };

        //Array'i list'e cevirelim cunku List'i kullanmak daha kolay
        List<Integer> myList = new ArrayList<>();
        Arrays.stream(arr).forEach(t->myList.add(t));

        System.out.println(myList);

        //List'teki max elemani bulalim

       int max= myList.stream().reduce(Math::max).get();
        System.out.println(max);

        //List'teki max elamanin index'ini bulalim

        int idxOfMax= myList.indexOf(max);
        System.out.println(idxOfMax);

        //maximum elemana kadarki tum elemanlari bir List'in icine koy
        List<Integer> firstList = new ArrayList<>();

        myList.stream().filter(t->myList.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t));
        System.out.println(firstList);

        List<Integer> firstListCopy = new ArrayList<>();

        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println(firstListCopy);

        Collections.sort(firstListCopy);



        boolean r1 = firstList.equals(firstListCopy);
        System.out.println(r1);


    }
}
