package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Deneme2 {

    public static void main(String[] args) {
        String s= "I like you, Like, Like!";

        System.out.println(s);

        s=s.replaceAll("\\p{Punct}","");

        String words []= s.split(" ");

        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> numO=new HashMap<>();

        for (String w: words){

            Integer num=numO.get(w);

            if (num==null){

                numO.put(w,1);

            }else{
                numO.replace(w,num+1);
            }



        }
        System.out.println(numO);

    }
}
