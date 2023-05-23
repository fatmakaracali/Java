package day36exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

      /*
       1)Run Buton'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
         ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
         "Runtime Exception" a ornektir.
         "Runtime Exception" lara "Unchecked Exception" da denir.

        2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
          FileNotFoundException, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception"lara "Checked Exception"da denir.

        3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde,Java "dosyanin adresi" ve "dosyanin varligi"
                                konusunda hata olusursa ne yapmasi gerektigini soylemenizi ister.

        4)IOException: "IO" Input Output demektir.

       IO, FileNotFoundException'in parentidir

        5)Java da hata'lar temelde 2'ye ayrilir.
            i)exception'lar    ii)Error'lar: a)StackOverflow Error b)Out Of Memory Error c)Virtual Machine Error

     */

    public static void main(String[] args) throws IOException {

         // 1.way: Exception'i method signature satirina ekledik
            FileInputStream fis = new FileInputStream("src/main/java/day36exception/TexFile");

            int i= 0;

            while ((i= fis.read())!=-1){

                System.out.print((char)i);

            }



    }
}