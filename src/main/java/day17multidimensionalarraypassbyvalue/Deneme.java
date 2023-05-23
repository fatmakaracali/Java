package day17multidimensionalarraypassbyvalue;


import java.util.Arrays;
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "";
      /*  do {
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();

            if(password.equals("AliCan")) {
                System.out.println("Doğru");
            }else {
                System.out.println("Yanlış");
            }

        }while(!(password.equals("AliCan")));*/

        Scanner input = new Scanner(System.in);
        String password1 = "";
        do {
            System.out.println("Passwordunuzu giriniz");
            password1 = scan.nextLine();

            if (!(password1.equals("AliCan"))) {
                System.out.println("Yanlış");
            }
        } while (!(password1.equals("AliCan")));
        System.out.println("Doğru");

        //"Multidimensional Array" nasil olusturulur?

        int ages[][] = new int[3][2];

        // [[5, 12], [81, 45], [123, 0]]

        //"Multidimensional Array"e eleman nasil eklenir?

        ages[1][0] = 81;
        ages[0][0] = 5;
        ages[0][1] = 12;
        ages[1][1] = 45;
        ages[2][0] = 123;
        ages[2][1] = 0;
        System.out.println(Arrays.deepToString(ages));

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(ages[1][1]);

        System.out.println(Arrays.toString(ages[0]));
        //Kisa yoldan Multidimensional Array nasil olusturulur?

        String names[][] = {{"ayse", "ben"}, {"sen", "biz", "onlar"}, {"siz"}};

        System.out.println(Arrays.deepToString(names));


        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum = 0;

        for (String[] w : names) {
            sum = sum + w.length;
        }
        System.out.println(sum);


        //Example 2: Yukaridaki students array'inde icinde "s" olan isimleri console'a yazdiriniz

        for (String [] w : names) {

            for (String k: w) {
                if (k.contains("e")) {
                    System.out.println(k);
                }
            }
        }

        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz

          int numbers [][]= {{5, 12}, {81, 45}, {123, 1}};

        int carp =1;

        for (int [] w : numbers) {
            for (int k : w) {
                carp =carp*k;
            }
        }
        System.out.println(carp);

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e cevirniz

        int numbers1 [][]= {{5, 12}, {81, 45}, {123, 1}};

       int toplamel=0;
       for (int [] w :numbers1){
           toplamel=toplamel+w.length;
       }

       int newnumber[]= new int [toplamel];


      int idx=0;

       for (int [] w: numbers1){
           for (int k : w){
               newnumber[idx]=k;
               idx++;
           }

       }
        System.out.println(Arrays.toString(newnumber));

        //Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz

        int A [][]= {{5, 12}, {81, 45}, {123, 1}};

        int small= A[0][0];
        int big=A[0][0];

        for (int [] w: A ){
            for (int k : w){

                small=Math.min(small,k);
                big=Math.max(big,k);


            }
        }
        System.out.println(big+small);





            }
        }







