package day15loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {



        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaziniz");
        String s= input.next();
        String s1="";

        for (int i =s.length()-1; i>=0 ; i--) {

            s1= s1 + s.substring(i,i+1);


        }
        System.out.println(s1);

        System.out.println();


        System.out.println("Lutfen ilk sayiyi giriniz");
        int b= input.nextInt();
        b= Math.abs(b);
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int c= input.nextInt();
       c= Math.abs(c);
        int c1=0;


        for ( int k= b; k<=c; k++){
            c1 = c1 + k;
        }
        System.out.println(c1);

        System.out.println();

        System.out.println("Lutfen 10'dan kucuk sayi giriniz");
        int n= input.nextInt();
        int m=1;
        for (int l=1;  l<=n; l++){

            m= m*l;

        }
        System.out.println(m);   //yanlis

        int ages[] = new int[5];
        System.out.println(Arrays.toString(ages)); //[0,0,0,0,0]
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        System.out.println(Arrays.toString(ages));   //[12, 23, 9, 38, 27]

        int sum=0;
        for (int ö : ages){
        sum = ö +sum;  }
        System.out.println(sum);

        char initials[] = new char[2];
        initials[0]='a';
        initials[1]='s';

       int  carpim =1;
       for(char w: initials){
       carpim= carpim*w;}
        System.out.println(carpim);




}}
