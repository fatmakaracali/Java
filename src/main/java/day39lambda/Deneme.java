package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Deneme {

    public static void main(String[] args) {
        List<String> myList =new ArrayList<>();

        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
     //   myList.add("Tom");
     //   myList.add("Clara");
        myList.add("Angelina");

        printEl(myList);

        System.out.println();

        printT(myList);

        System.out.println();

        printFour(myList);

        System.out.println();

        printFourT(myList);

        System.out.println();

        alb(myList);
    }

    public static void printEl(List<String> myList){

        myList.stream().forEach(t-> System.out.print(t+ " "));
    }

    public static void printT(List<String>myList){

        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.println(t+" "));
    }

    public static void printFour(List<String>myList){

        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.println(t+" "));
    }
    public static void printFourT(List<String>myList){

        myList.stream().filter(t->t.length()<4).map(t->t.toUpperCase()).forEach(t-> System.out.println(t));
    }

    public static void alb(List<String>myList){

        myList.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(t->t.length()
        )).forEach(t-> System.out.println(t));
    }

}
