package day12_switchloops;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ulke ismini girinizz");
        String name = input.nextLine();

        switch (name.toLowerCase()){
            case "amerika" :
                System.out.println("US");
            break;
            case "england" :
                System.out.println("UK");
            break;
            case "denmark" :
                System.out.println("DE");
            break;
            case "turkiye" :
                System.out.println("Tr");
            break;
            case "india" :
                System.out.println("IN");
            case "Pe"   :
                System.out.println("Peru");
            break;
             case "spain"   :
                System.out.println("ES");
                break;
             case "bulgaria"   :
                System.out.println("BG");
            break;
            case "albania"   :
                System.out.println("AL");
            break;
            case "france"   :
                System.out.println("FR");
            break;
            default :
                System.out.println("Bu ulke tanimli degildir");

        }
    }
}
