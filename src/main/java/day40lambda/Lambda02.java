package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<String>iller = new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","MUS","Kutahya","Ankara","Ordu","Gaziantep","Hatay","Edirne"));

        bykHrfLenghtArtanDistinc(iller);
        System.out.println();

        bykHrfSonHrfDistinctSorted(iller);
        System.out.println();

        bykHrfSortedDistinctAlfbtk(iller);
        System.out.println();

        System.out.println(elemanSil(iller));
        System.out.println();

        System.out.println( hIleBaslayanOruIleBitenSil(iller));
    } //main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfLenghtArtanDistinc(List<String>iller){

        iller.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHrfDistinctSorted(List<String>iller){

        iller.stream().
                distinct().
                map(t->t.toUpperCase()). //Lambda Expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));


    }
    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfSortedDistinctAlfbtk(List<String>iller){

        iller.stream().
                distinct().
                map(String ::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);  //method referance yöntemi
         //forEach(t-> System.out.print(t+" "));Lambda expression 'da böyle yazilir
    }

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

   public static List<String> elemanSil(List<String>iller){

        iller.removeIf(t->t.length()>5);
        return iller;
   }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz

    public static List<String> hIleBaslayanOruIleBitenSil(List<String>iller){

        iller.removeIf(t -> t.startsWith("H") || t.endsWith("u"));

        return iller;
    }

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
}
