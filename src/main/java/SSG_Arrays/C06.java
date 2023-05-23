package SSG_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06 {


    // Kullanicidan bir array'in boyutunu ve tum elementlerini alarak bir array olusturup,
    // bu array bize donduren bir method olusturun

    public static void arrayCreate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an Array number");
        int sayi = scan.nextInt();

        String[] arr = new String[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.println("Please enter an array element");
            arr[i]=scan.next();
        }
        System.out.println(Arrays.toString(arr));

    }







    public static void main(String[] args) {

    arrayCreate();




    }
}
