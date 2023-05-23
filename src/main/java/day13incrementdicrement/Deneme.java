package day13incrementdicrement;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        for (int i = 21; i < 180; i++) {
            if (i % 4 == 0 && i % 6 == 0) {

                System.out.println(i + "");


            }
        }

        String s = "ankara";

        for (int a = 0; a < s.length(); a++) {
            String ch = s.substring(a, a + 1);
            if (a % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);
            }

            System.out.println();
        }
        String t = "I love Java";
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);


            if (ch == 'a') {
                break;
            } else {
                System.out.print(ch);

            }
        }
        System.out.println();

            String f = "Ramazan";
            for (int sl=f.length()-1; sl>=0; sl--){
                char cv= f.charAt(sl);

                if (cv=='m'){
                    break;
                }else{
                    System.out.print(cv);
                }

            }
        System.out.println();
            String n="Pwd12?Ab";
        for (int i=0; i<n.length(); i++){

            char k=n.charAt(i);
            if (k>='a' && k<='z'){
                continue;
            }else{
                System.out.print(k);
            }
        }

        int sum =0;
        for(int i =578; i>0; i/= 10){
            sum=sum + i%10;
            System.out.println(sum);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String d= input.next();

        int summ =0;

        for (int i= 0; i<d.length(); i++) {

            String z=d.substring(i,i+1);

            if (d.indexOf(z)==d.lastIndexOf(z)) {

                summ = summ + Integer.valueOf(z);
            }
        }
        System.out.println(summ);

        String m= "Alala";
        String ö="";

        for (int i = 0; i <m.length() ; i++) {

            char g= m.charAt(i);

            if (m.indexOf(g) !=m.lastIndexOf(g) ){

                ö=ö+ g;
            }

        }
        System.out.println(ö);


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int r= input.nextInt();

        int y=1;

        while(y<11)
        { System.out.println(r +"*"+y+ " = "+ (y*r));


            y++;


        }


    }


    }

