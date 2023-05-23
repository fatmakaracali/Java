package day16arraysforeachloop;

import java.util.Arrays;

public class Deneme {

    public static void main(String[] args) {

        String name[]={"ali","ayse","fatma","veli"};

        System.out.println(Arrays.toString(name));

        System.out.println();

        name[0]="can";
        name[2]="kan";
        System.out.println(Arrays.toString(name));

        System.out.println();

        int sayi[]={1,2,3};
        int newsayi=sayi[0];


        sayi[0]=2;
        sayi[1]=3;
        sayi[2]=1;

        System.out.println(Arrays.toString(sayi));
        System.out.println();

        int sum =0;
        for(int w :sayi){

            sum = sum +w;
        }
        System.out.println(sum);


        int []random ={6,-4,12,4,7};

        int x=12;
        int y=Arrays.binarySearch(random,x);
        System.out.println(y);

    }
}
