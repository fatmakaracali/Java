package ReplitDeneme;

import java.util.Scanner;

public class Test {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yil ve ay numarasini giriniz");

        int yil = input.nextInt();
        int ay= input.nextInt();

        switch (ay){
            case 1 :
                System.out.println("Ocak "+ yil+ " 31 gundur");
                break;
            case 3:
                System.out.println("Mart "+ yil +" 31 gundur");
                break;
            case 5 :
                System.out.println("Mayis " +yil+" 31 gundur");
                break;
            case 7:
                System.out.println("Temmuz " +yil+ " 31 gundur");
                break;
            case 8:
                System.out.println("Agustos "+yil+" 31 gundur");
                break;
            case 10:
                System.out.println("Ekim "+yil+" 31 gundur");
                break;
            case 12:
                System.out.println("Aralik "+yil+" 31 gundur");
                break;

            case 4:
                System.out.println("Nisan "+yil+" 30 gundur");
                break;
            case 6:
                System.out.println("Haziran "+yil+" 30 gundur");
                break;
            case 9 :
                System.out.println("Eylul "+yil+" 30 gundur");
                break;
            case 11:
                System.out.println("Kasim "+yil+ " 30 gundur ");
                break;

            case 2:
                if(yil%4==0){
                    System.out.println("Subat "+yil+" 29 Gundur");
                }else
                {
            System.out.println("Subat "+yil+" 28 Gundur");

        }









    }
}}
