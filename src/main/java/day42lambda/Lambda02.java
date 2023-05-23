package day42lambda;

import day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7, 10));   //34

        System.out.println(getMultiplicationInTheGivenRange(7, 10)); //5040

        System.out.println(getSumInTheGivenRange(45,47));


    }
    // example 1 : 7'den 10'a kadar tamsayilarin toplamini hesaplayan methodu olusturnuz

    private static List<Integer> swap(int starting, int ending){
            List<Integer> list = new ArrayList<>();
        if (starting > ending) {
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    public static int getSumInTheGivenRange(int starting, int ending) {

       List<Integer> list = swap(starting,ending);

        return IntStream.rangeClosed(starting, ending).sum();

    }

    //example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan methodu olusturnuz

    public static int getMultiplicationInTheGivenRange(int starting, int ending) {

        List<Integer> list = swap(starting,ending);

        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();
    }

    //example 3: 45'den 47'e kadar tamsayilarin rakamlari toplamini hesaplayan methodu olusturunuz
    //Swap icin bir tane private method olusturun


    public static int getSumOfDigitInTheGivenRange(int starting, int ending) {

        List<Integer> list = swap(starting,ending);

      return  IntStream.rangeClosed(list.get(0), list.get(1)).map(Utils::getSumOfDigit).sum();


    }
}