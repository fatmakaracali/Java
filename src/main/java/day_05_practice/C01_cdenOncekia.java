package day_05_practice;

import java.util.Scanner;

public class C01_cdenOncekia {

    /*
    Kullanicidan aldiginiz 'c' ve 'a' iceren bir String deger icerisindeki 'c' karakterinden onceki 'a'
    karakterlerinin sayisini bulan bir kod yaziniz

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir kelime giriniz");
        String str = input.nextLine().toLowerCase();

        int counter=0;

        for (int i = 0; i <str.indexOf("c") ; i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }

        }
        System.out.println(counter);

        int sayac=0;
        if (str.contains("c") && str.contains("a")){

            for (int i=0; i<str.length(); i++){
                if(str.charAt(i)=='a'){
                    sayac++;
                }else if(str.charAt(i)=='c'){
                    break;

                }
            }
            System.out.println(sayac);

        }else{
            System.out.println("Lutfen c ve a harflerini iceren kelime giriniz");

        }

    }
}
