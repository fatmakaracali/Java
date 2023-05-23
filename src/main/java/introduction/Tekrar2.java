package introduction;

import java.util.Scanner;

public class Tekrar2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen kisa kenari giriniz");
        int kisaKenar= input.nextInt();

        System.out.println("Lutfen uzun kenari giriniz");

        int  uzunKenar = input.nextInt();


        System.out.println( kisaKenar+ uzunKenar);

    }
}
