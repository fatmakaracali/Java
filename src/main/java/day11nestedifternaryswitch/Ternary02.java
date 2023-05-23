package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {

        /* kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif " yazdirin, degilse ekrana "
        Pozitif degildir" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number = input.nextInt();

         String result = number>0 ? "Pozitf" : "Pozitif degil" ;
        System.out.println(result);


    }

}
