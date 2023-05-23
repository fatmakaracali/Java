package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    /*methodu ogrenirken;
    1) o method ne ise yarar
    2)o method nasil kullanilir
    3)o method ne verir
     */

    public static void main(String[] args) {

        ArrayList<String> cities= new ArrayList<>();

        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Yozgat");
        cities.add("Giresun");
        cities.add("Giresun");
        System.out.println(cities); //[Miami, Giresun, Yozgat, Barcelona, Miami, Yozgat]

        //ArrayList'teki bir elemanin "ilk gorunumu" nasil silinir?
        System.out.println(cities.remove("Miami")); //true
        System.out.println(cities); //[Giresun, Yozgat, Barcelona, Miami, Yozgat]

        System.out.println(cities.remove(2));  //Barcelona
        System.out.println(cities);  //[Giresun, Yozgat, Miami, Yozgat]

        //Arraylist olustururken en basa Arraylist yerine List de yazabilirizsiniz
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //example 12 elemanini ages List'ten siliniz
        ages.remove((Integer)12);//primitive int olur. primitive int remove() method icinde kullaninca Java
                              //onu index zanneder. Jvaya 12 nin index olmadigini soylemek icin primitive int yerin
                              //wrapper class int kullanir
        System.out.println(ages);    //[23, 7, 4]


        //Bir Listteki bir elemanin tum gorunumlerini nasil sileriz?

        List<String> citiesToRemove = new ArrayList<>();

        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");
        System.out.println(cities.removeAll(citiesToRemove));
        System.out.println(cities);



        //Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz?

        //Kisa yoldan bir list olusturmak icin list.of methodu kullanilabilir

        List<Character>initials= List.of('a','b','c','d','b');
        System.out.println(initials);  //  [a, b, c, d , b]


        List<Character>letters =List.of('a','b','c','d','b');
        System.out.println(letters);


        boolean t1= initials.equals(letters);
        System.out.println(t1);  //true
        //equels methodu ayni elemanlar ayni indekste oldugusurece true verir


        int r2=  initials.indexOf('b');
        System.out.println(r2);  //1

        // indexOf('b') yazarsaniz 'b' nin ilk gorunumunun index'ini verir
        //lastindexof('b')  yazarsaniz 'k' nin son gorunumunun indexini verir


        // Bir listteki tekrarsiz elemanlari console'a yazdiran kodu yaziniz
        List<Double> price = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w : price){
           if(price.indexOf(w)==price.lastIndexOf(w)){
               System.out.println(w +" ");                  //3.75   4.0 tekrarsiz
           }
        }

        //bir listte  tekrarli eleman olup olmadigini gosteren kodu yaziniz

        List<Double> heights = List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        int counter =0;
        for (Double w : heights) {


            if (heights.indexOf(w) != heights.lastIndexOf(w)) {
                counter++;

            }
        }
            if(counter==0){
                System.out.println("All elements are unique in the list");
            } else{
                System.out.println("At least one element is not unique in the list");
            }









    }
}
