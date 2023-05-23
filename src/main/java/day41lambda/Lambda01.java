package day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));

        System.out.println(getMultilicationOgSquareOfEvens(nums));

        System.out.println(getSumOfEvenMaxAndOddMin(nums));

        System.out.println(getTheSumOfEvenGreaterThanSevenMaxAndOddMinGreaterThanEight(nums));

        System.out.println(getTheSumOfSquareOfOdds2(nums));


    }

    //Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz

    public static int getTheSumOfSquareOfOdds1(List<Integer>nums){
      return  nums.stream().
              filter(t->t%2 !=0).
              map(t->t*t).
              reduce(0,(t,u)->t+u);
    }

    public static int getTheSumOfSquareOfOdds2(List<Integer>nums){
        return  nums.stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).    //ihtiyac duyulan method Java Class'larinda yoksa Utils Class olusturup icinde ihtiyaciniz
                                          // olan method'u olusturunuz ve method reference kullaniniz
                reduce(0, Math ::addExact); //Class ismi ::Method ismi ==>Method Reference
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer>nums){
        return  nums.stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce( Math ::addExact).  //Class ismi ::Method ismi ==>Method Reference
                get(); //get() methodu Optinal<Integer> i Integer'a cevirir
    }



    //Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olustur

    public static int getMultilicationOgSquareOfEvens(List<Integer>nums){

        return nums.stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(1,(t,u)->t*u);
    }

    //Verilen bir list'teki cift sayi olan elemanlarin max degeri ile tek sayi olan elemanlarin min degerinin toplami

    public static int getSumOfEvenMaxAndOddMin(List<Integer>nums){

     int maxEven =   nums.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u ? t:u).get();

      int minOdd =               nums.stream().distinct().filter(t->t%2!=0).reduce((t,u)->t<u ? t: u).get();

      return maxEven + minOdd;
    }

    //Verilen bir list'teki cift sayi olan elemanlarin 7den kucuk max degeri ile tek sayi olan elemanlarin 8 den buyuk min degerinin toplami

    public static int getTheSumOfEvenGreaterThanSevenMaxAndOddMinGreaterThanEight(List<Integer>nums){

        int max = nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ?t:u).get();

        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t :u).get();

        return max + min;
    }
}
