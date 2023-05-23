package day33maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {

        /*
        HashMap ile HashTable arasindaki fark nedir?
        i)"HashMap" "thread-safe" degildir, "HashTable"  "thread-safe"dir
          "HashMap" "synchronized" degildir, "HashTable"  "synchronized"dir. mantikli siralama
        ii) "HashMap"bir tane "null" key'e ve istediginiz kadar "null" value'ye izin verir
            "HashTable" key'lerde de value'lerde de "null" kulllanilmasina izin vermez
        ii) "HashMap hizlidir, HashTable "HashMap'e göre yavastir
        NOTE: "HashMap" ve  "HashTable" ikisi de entry'i rastgele siralar

         */

        Hashtable<String,Integer> stdAges= new Hashtable<>();

        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",43);
      //  stdAges.put("null",43);      HashTable'larin key'i null olamaz
      //  stdAges.put("Walker",null);  HashTable'larin value'si null olamaz

        System.out.println(stdAges);



    }
}
