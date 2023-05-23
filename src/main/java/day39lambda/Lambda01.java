package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Lambda01 {

    public static void main(String[] args) {

        List<String>myList =new ArrayList<>();

        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);

        System.out.println();

        printEl(myList);
        System.out.println();

        printELEExceptStartsWithT(myList);
        System.out.println();

        printElLengthLessThanFour(myList);
        System.out.println();

        printElLenghtMoreThanWithUpper(myList);
        System.out.println();

       printElLenghtMoreThanFourUniqueLowerCase(myList);
        System.out.println();

        printElUniqueToUpperCaseSorted(myList);
        System.out.println();

        printElUniqueLowerCaseSortWithLenght(myList);


    }

    //Bir List'teki elemanlari console'a yazdiran method'u olusturunuz

    public static void printElements(List<String> myList){
        for (String w: myList) {
            System.out.println(w + " ");
        }
    }

    //2.yol : Lambda Expression

    public static void printEl(List<String> myList){

        myList.stream().forEach(t-> System.out.print(t +" "));   //Functional Programming

        //Lambda bir Functional Programming'dir

        //stream() datalari akisa sunar
    }

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran kodu olusturunuz

    public static void printELEExceptStartsWithT(List<String>myList){

        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.println(t + " "));


    }
    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiriniz

    public static void printElLengthLessThanFour(List<String>myList){

        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.println(t+ " "));
    }

    //Bir Listteki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiriniz

    public static void printElLenghtMoreThanWithUpper(List<String>myList){

        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.println());
    }

    //Bir Listteki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerele console'a yazdiran method'u yazdiriniz

    public static void printElLenghtMoreThanFourUniqueLowerCase(List<String>myList){

        myList.stream().filter(t->t.length()>4).distinct().map(t->t.toLowerCase()).forEach(t-> System.out.println(t+ " "));
    }
    //distict: tekrarsiz yazdirir
    //map: yapisini degistirir

    //Bir Listteki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada konsole'a yazdiriniz

    public static void printElUniqueToUpperCaseSorted(List<String>myList){

        myList.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.println(t+ " "));
    }

    //Bir Listteki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak

    public static void printElUniqueLowerCaseSortWithLenght(List<String> myList){

        myList.stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())). //Comparator.comparing karsilastirici.karsilastirmayi biz yapacaksak kullaniriz
                forEach(t-> System.out.println(t+ " "));
    }

    //sorted() : natural order olarak calisir.
    //tersten siralama da reverse order'dir

}
