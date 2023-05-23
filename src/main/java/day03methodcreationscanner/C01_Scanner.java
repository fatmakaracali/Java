package day03methodcreationscanner;




import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter veriniz...");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);



        //Sadece char data type'i icin nextChar() diye bir method olmadigi icin kullanicidan alip ch konteynir'ina yerlestimek icin cagariyoruz
        //next().charAt(0);methodunu kullaniriz

        // aralarinda bir tab bosluk birakarak tek sout ile ayni sekli olustaralim.

        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +
                "\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);


    }
}

