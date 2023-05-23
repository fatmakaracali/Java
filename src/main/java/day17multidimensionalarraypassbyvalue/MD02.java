package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MD02 {

    public static void main(String[] args) {
        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz

        int numbers[][] = {{5, 4}, {2, 3, 2}}; // ==> { 5, 4, 2, 3, 2 }

        //1.step: kac array var once onu bul
        int toplamElemanSayisi = 0;

        for (int[] w : numbers) {
            toplamElemanSayisi = toplamElemanSayisi + w.length;

        }
        System.out.println(toplamElemanSayisi);  // 5

        //2.step tek boyutlu array olustur

        int newArr[] = new int[toplamElemanSayisi];

        //3.step aktarma
        int idx = 0;
        for (int[] w : numbers) {

            for (int k : w) {

                newArr[idx] = k;
                idx++;


            }
        }
        System.out.println(Arrays.toString(newArr));


    }
}