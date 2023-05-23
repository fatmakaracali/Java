package day34exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {
    public static void main(String[] args) {

        //Bir String'deki karakter sayisini veren method olusturunuz
        //String'in degeri "null" oldugunda String Class'daki bazi methodlari kullanamayiz. Kullanirsaniz Java "NullPointerException" atar


           System.out.println(

    getNumOfChars("Java"));//4
        System.out.println(

    getNumOfChars("Money"));//5
        System.out.println(

    getNumOfChars(""));

        System.out.println(

    getNumOfChars(null));
}


    //Bir String'deki character sayisini veren method olusturunuz.
    public static int getNumOfChars(String s) {


        int result = 0;

        try {
            result = s.length();
        } catch (
                NullPointerException e) {//"NullPointerException" String class'da "null" ile uyumlu olmayan method'lar kullanildiginda atilir.
            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//Java'nin Exception icin urettigi teknik mesaji varsa verir.
        }
        return result;




        }
    }
    //NOTE: String classta lenght kullanirken, Stringi null yapmistim, NullPointerException verdi
    //ArrayIndexOutOfBound exception aldim. Array'da varolmayan index kullanmistim. cozum olarak try-catch kullandim. catch kisminda requement dokumanina
    //uygun olarak negatif indexler icin ilk elemani return eden, son indexten buyuk indexler icin son elemani return  bir kod yazdim.
    //ve exception'i  handle ettim


