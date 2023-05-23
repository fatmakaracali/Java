package day37exceptionenums;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IllegalGradeException extends Exception {

    /*
    1)CustomException Class olusturmak icin Exception Class'a extend etmeliyiz
    Exception Class'a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur

    2) CustomException Class olustururken "constructor olusturmaliyiz
       Bu "constructor" parent'taki constructor'i cagirmalidir
        Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir
    3)   CustomException Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz
    IllegalGradeException oldugu gibi
     */

    public IllegalGradeException(String message) {    //constructor

        super(message);   // objeyi parentten olusturur


    }

    public IllegalGradeException() {    //constructor

        super();

    }

   public static void main(String[] args) {
      /* int x = 5;
        int y = 0;
         System.out.println(x / y);
        System.out.println("Good");
        System.out.println(x / y);*/





        try {
            FileInputStream f = new FileInputStream("src/daypackage/TextFile");
        } catch (FileNotFoundException e) {
            System.out.println("Good");

        } catch(IOException e){
            System.out.println(" bad");
        }
    }



    String str = "a";
    void A() {
        try {
            str = str + "b";
            B();
        } catch (Exception e) {
            str = str + "c";
        }
    }
    void B() throws Exception {
        try {
            str = str + "d";
            C();
        } catch (Exception e) {
            str = str + "e";
        } finally {
            str = str + "f";
        }
        str = str + "g";
    }
    void C() throws Exception {
        System.out.println(12/0);
    }
    void display() {
        System.out.println(str);
    }

    }
