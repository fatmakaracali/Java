package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Interview_HashMap {

    public static void main(String[] args) {


        String s= "I like you, Like, Like!";

        System.out.println(s);

        s= s.replaceAll("\\p{Punct}","");

        System.out.println(s);

        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> occ=new HashMap<>();

        for (String w: words
             ) {
            Integer numOfOccurrence = occ.get(w);

            if(numOfOccurrence==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurrence+1);
            }

        }
        System.out.println(occ);

    }
}
