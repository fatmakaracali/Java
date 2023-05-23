package day_03_practice;

import java.util.Scanner;

public class C03_ifElse {
    public static void main(String[] args) {

        /*
Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
Eger İlk kelimenin karakter sayısı çift ise,
 ikinci kelimeyi birinci kelimenin ortasına koyun.
İlk kelimenin karakter sayısı tek ise, konsola
"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kelime giriniz");
        String word0= input.next();

        System.out.println("Lutfen kelime giriniz");
        String word1= input.next();

        if(word0.length()%2==0){

           String firstHalf= word0.substring(0,word0.length()/2);
           String secondHalf= word0.substring(word0.length()/2);
            System.out.println(firstHalf+word1+secondHalf);



        }else
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");

    }
}
