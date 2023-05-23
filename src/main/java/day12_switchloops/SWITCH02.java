package day12_switchloops;

import java.util.Scanner;

public class SWITCH02{

    public static void main(String[] args) {

        // kullanicidan iki sayi ve yapilacak islemi olan ve +,-,*,/% islemlerini yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double a= input.nextDouble();
        double b= input.nextDouble();

        System.out.println("Lutfen yapilacak islemi giriniz +,-,*,/,%");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+ " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a+ " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a+ " * " + b + " = " + (a*b));
                break;
            case '/':
                System.out.println(a+ " / " + b + " = " + (a/b));
                break;
            case '%':
                System.out.println(a+" * " +b + " = " + (a*b/100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir");

        }



    }
    }


