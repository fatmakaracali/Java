package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        sortWithLastCharDistinctUpperInList(names);
        System.out.println(sortWithLastCharDistinctUpperInList(names));
        //[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]




        System.out.println(sortWithLengthReversedSameLegthInNaturalOrderLowerInList(names));
       //[alexander, michael, alex, alex, mary, jim, tom]


        System.out.println(isLegthMoreThanTwo(names));  //true

        System.out.println(noLengthLessThanThree(names));

        System.out.println(atLastOneLegthLessThanFour(names));

    }


    //List elemanlarini son harflerine gore natural order'a tekrarsiz olarak buyuk harfle bir List icinde return ediniz

    //[Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]

    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names) {

        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList()); //normalde distinct elemanlari depolamak icin "Set" kullanilir. ama Lambda'daki
                                    //toSet methodu elemanlari rastgele siralar. Halbuki bu soruda rastgele siralama kabul edilmiyor.
                                    //bu yuzden mecburen collect(Collecttors.toList()); kullandik


    }

    //example 2:List elemanlarini karakter sayilarina gore ters sirada kucuk harfle bir list icinde return ediniz
    //ayni karakter sayisina sahip elemanlar kendi icinde alfabetik sirada olsun

    public static List<String> sortWithLengthReversedSameLegthInNaturalOrderLowerInList(List<String>names){

        return   names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }

    //example 3:List elemanlarinin tamamiminin karakter sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz

    public static boolean isLegthMoreThanTwo(List<String>names){

      return  names.stream().allMatch(t->t.length()>2);



    }

    //example 4: List elemanlarinin hicbirinin karakter sayisinin 3 den kucuk olmadigini kontrol eden methodu olustrunuz

    public static boolean noLengthLessThanThree(List<String>names){

        return names.stream().noneMatch(t->t.length()<3);
    }

    //List elemanlarinin en az birinin karakter sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz

    public static boolean atLastOneLegthLessThanFour(List<String>names){

      return  names.stream().anyMatch(t->t.length()<4);
    }

      /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur*/



    }
