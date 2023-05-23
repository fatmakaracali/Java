package day33maps;

import java.util.HashMap;
import java.util.Map;

public class Deneme {

    public static void main(String[] args) {

     String s ="Ramazan";
        //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //           "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
        System.out.println(getTheNumOfOccurenceOfLetters(s));

    }

   public static  HashMap<String,Integer> getTheNumOfOccurenceOfLetters(String s){
        s= s.replaceAll("[^A-Za-z]","");

        HashMap<String,Integer> numOfOccurence= new HashMap<>();

        String letters []= s.split("");

       for (String w: letters) {
           Integer numAcc= numOfOccurence.get(w);

           if( numAcc==null){
               numOfOccurence.put(w,1);
           }else{

               numOfOccurence.put(w,numAcc+1);
           }
       }
       return numOfOccurence;

   }
}
