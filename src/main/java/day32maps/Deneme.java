package day32maps;

import java.util.*;

public class Deneme {

    public static List<String> getNonRepeatedChars(String str){

        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String arr[] = str.split("");

        for (String w: arr) {
            map.computeIfPresent(w,(key,value)->value+1);
            map.computeIfAbsent(w,k->1);
        }
        System.out.println(map);

        for(Map.Entry<String,Integer> w : map.entrySet()){
            if(w.getValue()==1){
                list.add(w.getKey());
            }
        }
        return list;

    }

    public static void main(String[] args) {

        String str="Hello";

        System.out.println(getNonRepeatedChars(str));
    }


    }

