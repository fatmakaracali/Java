package day14Loops;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println("Java nedri");
        }

        for (int s = 1; s < 100; s++) {
            if (s % 3 == 0)
                System.out.print("java" + " ");
        }
        System.out.println();

        for (char i = 'f'; i > 'a'; i--) {
            System.out.print(i + " ");
            i--;
        }
        int numA=4;
        while(numA<3) {
            System.out.print(numA);
            numA++;
        }


        String m= "Alala";
        String ö="";

        for (int i = 0; i <m.length() ; i++) {

            char g= m.charAt(i);

            if (m.indexOf(g) !=m.lastIndexOf(g) ){

                ö=ö+ g;
            }

        }
        System.out.println(ö);


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir sayi giriniz");
            int j= input.nextInt();
            if (j<100){
                System.out.println("Won");
            }else {
                System.out.println("Lost");
                break;
            }



        }while(true);


        do {
            Scanner input= new Scanner(System.in);

            System.out.println("Lutfen cumle giriniz");
            String w= input.nextLine();
            if (w.endsWith(".") && (w.charAt(0)>='A') && (w.charAt(0)<='Z')){
                System.out.println("true");
            }else{
                System.out.println("false");
                break;
            }

        }while (true);

        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";
        do {
            if (counter==3){
                System.out.println("Blocked");
                break;
            }

            System.out.println("Lutfen username giriniz");
            String as= input.next();
            System.out.println("Lutfen paswordu giriniz");
            String ad= input.next();
            counter++;

            if (ad.equals(validPassWord) && as.equals(validUserName)){
                System.out.println("Welcome");
                break;
            }
            else{
                System.out.println("invalid ad or as");

            }

        }while (true);











    }
    }

